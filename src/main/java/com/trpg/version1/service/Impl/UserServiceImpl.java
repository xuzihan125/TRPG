package com.trpg.version1.service.Impl;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.Enum.RoleEnum;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.common.security.JWT.JWTUtil;
import com.trpg.version1.common.util.StringUtil;
import com.trpg.version1.mybatis.dao.*;
import com.trpg.version1.mybatis.dto.LoginDTO;
import com.trpg.version1.mybatis.dto.UserDTO;
import com.trpg.version1.mybatis.dto.UserModifyDTO;
import com.trpg.version1.mybatis.entity.*;
import com.trpg.version1.mybatis.vo.LoginVO;
import com.trpg.version1.mybatis.vo.UserInfoVO;
import com.trpg.version1.mybatis.vo.UserModifyVO;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private CharactMapper characterMapper;

    @Resource
    private CommentUserMapper commentUserMapper;

    @Resource
    private AttributeMapper attributeMapper;

    @Resource
    private AttributeCharacterMapper attributeCharacterMapper;

    @Resource
    private JWTUtil jwtUtil;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        if(StringUtil.isEmpty(email)){
            throw new UsernameNotFoundException("??????????????????");
        }
        SysUserExample userExample = new SysUserExample();
        userExample.createCriteria().andEmailEqualTo(email);
        List<SysUser> result = sysUserMapper.selectByExample(userExample);
        SysUser user = result.stream().findFirst().orElse(null);
        if(user == null){
            throw new UsernameNotFoundException("????????????");
        }
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(PREFIX+RoleEnum.DEFAULT_ROLE.getRole()));
        return new User(user.getEmail(),user.getPassword(),roles);
    }

    @Override
    public LoginVO login(LoginDTO loginDTO) {
        //????????????
        LoginVO loginVO = new LoginVO();
        //????????????
        String email = loginDTO.getEmail();
        String password = loginDTO.getPassword();
        //????????????
        SysUserExample example = new SysUserExample();
        example.createCriteria().andEmailEqualTo(email);
        long count = sysUserMapper.countByExample(example);
        if(count == 0){
            throw new OpException(ResultCode.EMAIL_NOT_EXIST.getCode(),ResultCode.EMAIL_NOT_EXIST.getDesc());
        }
        List<SysUser> result = sysUserMapper.selectByExample(example);
        SysUser user = result.stream().findFirst().orElse(null);
        if(user == null){
            throw new OpException(ResultCode.EMAIL_NOT_EXIST.getCode(),ResultCode.EMAIL_NOT_EXIST.getDesc());
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if(!passwordEncoder.matches(password,user.getPassword())){
            throw new OpException(ResultCode.WRONG_PASSWORD.getCode(),ResultCode.WRONG_PASSWORD.getDesc());
//            loginVO.setStatus(false);
//            return loginVO;
        }
        //???????????????
        loginVO.setStatus(true);
        loginVO.setEmailAddress(email);
        loginVO.setNickname(user.getNickname());
        //??????token
        UserDTO userDTO  = new UserDTO();
        userDTO.setPassword(password);
        userDTO.setEmail(email);
        userDTO.setNickname(user.getNickname());
        userDTO.setPhone(user.getPhone());
        loginVO = new LoginVO(user.getNickname(),jwtUtil.generateJWT(userDTO),user.getEmail(),user.getUserid());
        return loginVO;
    }

    @Override
    public UserModifyVO UserModify(UserModifyDTO userModifyDTO) {
        //?????????
        UserModifyVO userModifyVO = new UserModifyVO();
        //????????????
        if(StringUtil.isEmpty(userModifyDTO)){
            throw new OpException(ResultCode.INVALID_ATTRIBUTE.getCode(),ResultCode.INVALID_ATTRIBUTE.getDesc());
        }
        SysUserExample example = new SysUserExample();
        example.createCriteria().andEmailEqualTo(userModifyDTO.getEmail()).andUseridNotEqualTo(userModifyDTO.getUid());
        if (sysUserMapper.countByExample(example)>0){
            throw new OpException(ResultCode.EMAIL_ALREADY_EXIST.getCode(),ResultCode.EMAIL_ALREADY_EXIST.getDesc());
        }
        //????????????
        SysUser user = new SysUser();
        user.setEmail(userModifyDTO.getEmail());
        user.setUserid(userModifyDTO.getUid());
        user.setPhone(userModifyDTO.getPhone());
        user.setNickname(userModifyDTO.getNickname());
        user.setDescri(userModifyDTO.getDescri());

        example.clear();
        example.createCriteria().andUseridEqualTo(userModifyDTO.getUid());
        sysUserMapper.updateByExampleSelective(user, example);
        //???????????????
        userModifyVO.setEmail(userModifyDTO.getEmail());
        userModifyVO.setUid(userModifyDTO.getUid());
        userModifyVO.setPhone(userModifyDTO.getPhone());
        userModifyVO.setNickname(userModifyDTO.getNickname());
        userModifyVO.setDescri(userModifyDTO.getDescri());
        return userModifyVO;
    }

    @Override
    public UserInfoVO userInfo(Integer id) {
        //?????????
        UserInfoVO userInfoVO = new UserInfoVO();

        if(id == null){
            throw new OpException(ResultCode.INVALID_ATTRIBUTE.getCode(),ResultCode.INVALID_ATTRIBUTE.getDesc());
        }

        //??????id????????????????????????
        SysUserExample userExample = new SysUserExample();
        userExample.createCriteria().andUseridEqualTo(id);
        List<SysUser> result = sysUserMapper.selectByExample(userExample);
        SysUser user = result.stream().findFirst().orElse(null);
        if(user == null){
            throw new OpException(ResultCode.EMAIL_NOT_EXIST.getCode(),ResultCode.EMAIL_NOT_EXIST.getDesc());
        }
        userInfoVO.setUserid(id);
        userInfoVO.setEmail(user.getEmail());
        userInfoVO.setNickname(user.getNickname());
        userInfoVO.setPhone(user.getPhone());
        userInfoVO.setDescri(user.getDescri());
        userInfoVO.setGame_num(user.getGamefinish());

        //????????????id??????????????????????????????
        CommentUserExample commentUserExample = new CommentUserExample();
        commentUserExample.createCriteria().andUseridtargetEqualTo(id);
        List<CommentUser> commentUserList = commentUserMapper.selectByExample(commentUserExample);
        userInfoVO.setCommentUserList(commentUserList);
        int sum = 0;
        for(CommentUser commentUser:commentUserList){
            sum += commentUser.getScore();
        }
        userInfoVO.setAvgscore(commentUserList.size() == 0 ? 0 : sum / commentUserList.size());
        userInfoVO.setCommentUserNum(commentUserList.size());

        //??????id??????????????????????????????
        CharactExample characterExample = new CharactExample();
        characterExample.createCriteria().andUseridEqualTo(id);
        List<Charact> characters = characterMapper.selectByExample(characterExample);

        List<Map<String, String>> characterDescriptionOfUserList = new ArrayList<Map<String, String>>();
        for(Charact character : characters){
            //????????????????????????????????????
            Map<String, String> attributes = new HashMap<String, String>();
            Integer characterid = character.getCharacterid();
            AttributeCharacterExample attributeCharacterExample = new AttributeCharacterExample();
            attributeCharacterExample.createCriteria().andCharacteridEqualTo(characterid);
            List<AttributeCharacter> attributeCharacters = attributeCharacterMapper.selectByExample(attributeCharacterExample);
            for(AttributeCharacter attributeCharacter:attributeCharacters){
                int attributeid = attributeCharacter.getAttributeid();
                AttributeExample attributeExample = new AttributeExample();
                attributeExample.createCriteria().andAttributeidEqualTo(attributeid);
                List<Attribute> attributeList = attributeMapper.selectByExample(attributeExample);
                for(Attribute attribute:attributeList){
                    attributes.put(attribute.getName(), attribute.getDescri());
                }
            }
            characterDescriptionOfUserList.add(attributes);
        }
        userInfoVO.setCharacterList(characters);
        userInfoVO.setCharacterNum(characters.size());
        return userInfoVO;
    }

    @Override
    public String createUser(UserDTO dto) {
        //????????????
        if(StringUtil.isEmpty(dto)){
            throw new OpException(ResultCode.INVALID_ATTRIBUTE.getCode(),ResultCode.INVALID_ATTRIBUTE.getDesc());
        }
        if(!(dto.getPassword().equals(dto.getRepassword()))){
            throw new OpException(ResultCode.INVALID_PASSWORD_NOTEQUAL_REPASSWORD.getCode(),ResultCode.INVALID_PASSWORD_NOTEQUAL_REPASSWORD.getDesc());
        }
        //????????????
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
        return "????????????";
    }
}
