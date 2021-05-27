package com.trpg.version1.common.security.JWT;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.Enum.RoleEnum;
import com.trpg.version1.common.Enum.TokenAttribute;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.mybatis.dto.AuthDTO;
import com.trpg.version1.mybatis.dto.UserDTO;
import com.trpg.version1.service.UserService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/8
 **/
@Component
public class JWTUtil {

    @Value("${jwt.token.secret}")
    private String secret;

    @Value("${jwt.token.expiration}")
    private int expiration;

    @Resource
    private UserService userService;

    /**
     * @description: 获得token内容
     * @author xuzih
     * @date 2021/5/18 2:38
     * @version 1.0
     */
    private Claims getClaimsFromToken(String token) {
        Claims claims;
        try {
            claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            claims = null;
        }
        return claims;
    }

    /**
     * @description: 获得用户名
     * @author xuzih
     * @date 2021/5/18 2:39
     * @version 1.0
     */
    public String getUserNameFromToken(String token){
        String userName;
        try{
            userName = (String)getClaimsFromToken(token).get(TokenAttribute.USERNAME.getCode());
        }
        catch (Exception e){
            userName = null;
        }
        return userName;
    }

    /**
     * @description: 设置过期时间
     * @author xuzih
     * @date 2021/5/18 2:39
     * @version 1.0
     */
    public Date getExpiration(){
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

    /**
     * @description: 生成token内容
     * @author xuzih
     * @date 2021/5/18 2:39
     * @version 1.0
     */
    public Map<String,Object> getClaim(UserDTO userDTO){
        Map<String,Object> claims = new HashMap<>();
        claims.put(TokenAttribute.USERNAME.getCode(),userDTO.getEmail());
        claims.put(TokenAttribute.PASSWORD.getCode(),new BCryptPasswordEncoder().encode(userDTO.getPassword()));
        claims.put(TokenAttribute.NICKNAME.getCode(),userDTO.getNickname());
        claims.put(TokenAttribute.PHONE.getCode(),userDTO.getPhone());
        List<String> roles = new ArrayList<>();
        roles.add(RoleEnum.DEFAULT_ROLE.getRole());
        claims.put(TokenAttribute.ROLE.getCode(),roles);
        return claims;
    }

    /**
     * @description: 创建JWT
     * @author xuzih
     * @date 2021/5/18 2:39
     * @version 1.0
     */
    public String generateJWT(UserDTO userDTO){
        String tempo = Jwts.builder()
                .setSubject((userDTO.getEmail()))
                .setClaims(getClaim(userDTO))
                .setIssuedAt(new Date())
                .setExpiration(getExpiration())
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
        return tempo;
    }

    public String generateJwtToken(Authentication authentication) {

        AuthDTO userPrincipal = (AuthDTO) authentication.getPrincipal();

        return Jwts.builder()
                .setSubject((userPrincipal.getUsername()))
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + expiration*1000))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }


    /**
     * @description: 验证jwt
     * @author xuzih
     * @date 2021/5/18 2:40
     * @version 1.0
     */
    public boolean validJWT(String token) throws OpException {
        Claims claims = getClaimsFromToken(token);
        return claims != null;
    }

    /**
     * @description: 生成user(token验证)
     * @author xuzih
     * @date 2021/5/18 3:27
     * @version 1.0
     */
    public UserDetails getUserDetails(String token){
        Claims claims = getClaimsFromToken(token);
        if(claims==null){
            throw new OpException(ResultCode.TOKENERROR.getDesc(),ResultCode.TOKENERROR.getCode());
        }
        String username = (String)claims.get(TokenAttribute.USERNAME.getCode());
        UserDetails userDetails = userService.loadUserByUsername(username);
        return userDetails;
//        String password = (String)claims.get(TokenAttribute.PASSWORD.getCode());
//        List rolesObject = claims.get(TokenAttribute.ROLE.getCode(),List.class);
//        List<GrantedAuthority> roles = new ArrayList<>();
//        for(Object obj: rolesObject){
//            roles.add(new SimpleGrantedAuthority((String)obj));
//        }
//        return new User(username,password,roles);


    }
}
