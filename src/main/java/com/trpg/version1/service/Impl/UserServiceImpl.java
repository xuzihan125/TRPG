package com.trpg.version1.service.Impl;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.Enum.RoleEnum;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.common.security.JWT.JWTUtil;
import com.trpg.version1.common.util.StringUtil;
import com.trpg.version1.mybatis.dao.SysUserMapper;
import com.trpg.version1.mybatis.dto.LoginDTO;
import com.trpg.version1.mybatis.dto.UserDTO;
import com.trpg.version1.mybatis.entity.SysUser;
import com.trpg.version1.mybatis.entity.SysUserExample;
import com.trpg.version1.mybatis.vo.LoginVO;
import com.trpg.version1.service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/23
 **/
@Service
public class UserServiceImpl implements UserService {
    private static String PREFIX="ROLE_";

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private JWTUtil jwtUtil;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        if(StringUtil.isEmpty(email)){
            throw new UsernameNotFoundException("用户名称为空");
        }
        SysUserExample userExample = new SysUserExample();
        userExample.createCriteria().andEmailEqualTo(email);
        List<SysUser> result = sysUserMapper.selectByExample(userExample);
        SysUser user = result.stream().findFirst().orElse(null);
        if(user == null){
            throw new UsernameNotFoundException("登录失败");
        }
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(PREFIX+RoleEnum.DEFAULT_ROLE.getRole()));
        return new User(user.getEmail(),user.getPassword(),roles);
    }

    @Override
    public LoginVO login(LoginDTO loginDTO) {
        //返回变量
        LoginVO loginVO = new LoginVO();
        //获得参数
        String mail = loginDTO.getUsername();
        String password = loginDTO.getPassword();
        //校验信息
        SysUserExample example = new SysUserExample();
        example.createCriteria().andEmailEqualTo(mail);
        List<SysUser> result = sysUserMapper.selectByExample(example);
        SysUser user = result.stream().findFirst().orElse(null);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if(user ==null || !passwordEncoder.matches(password,user.getPassword())){
            loginVO.setStatus(false);;
            return loginVO;
        }
        //构造返回值
        loginVO.setStatus(true);
        loginVO.setEmailAddress(mail);
        loginVO.setNickname(user.getNickname());
        //创建token
        UserDTO userDTO  = new UserDTO();
        userDTO.setPassword(password);
        userDTO.setEmail(mail);
        userDTO.setNickname(user.getNickname());
        userDTO.setPhone(user.getPhone());
        loginVO.setToken(jwtUtil.generateJWT(userDTO));
        return loginVO;
    }

    @Override
    public String createUser(UserDTO dto) {
        //参数校验
        if(StringUtil.isEmpty(dto)){
            throw new OpException(ResultCode.INVALID_ATTRIBUTE.getCode(),ResultCode.INVALID_ATTRIBUTE.getDesc());
        }
        //邮箱效验
        SysUserExample userExample = new SysUserExample();
        userExample.createCriteria().andEmailEqualTo(dto.getEmail());
        long count = sysUserMapper.countByExample(userExample);
        if(count > 0){
            throw new OpException(ResultCode.EMAIL_ALREADY_EXIST.getCode(),ResultCode.EMAIL_ALREADY_EXIST.getDesc());
        }
        SysUser user = new SysUser();
        user.setEmail(dto.getEmail());
        user.setNickname(dto.getNickname());
        user.setPassword(new BCryptPasswordEncoder().encode(dto.getPassword()));
        user.setPhone(dto.getPhone());
        user.setState(0);
        sysUserMapper.insert(user);
        return "注册成功";
    }
}
