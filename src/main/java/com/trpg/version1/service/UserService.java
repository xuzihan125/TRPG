package com.trpg.version1.service;

import com.trpg.version1.mybatis.dto.LoginDTO;
import com.trpg.version1.mybatis.dto.UserDTO;
import com.trpg.version1.mybatis.dto.UserModifyDTO;
import com.trpg.version1.mybatis.vo.LoginVO;
import com.trpg.version1.mybatis.vo.UserInfoVO;
import com.trpg.version1.mybatis.vo.UserModifyVO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    String createUser(UserDTO dto);

    LoginVO login(LoginDTO loginDTO);

    UserModifyVO UserModify(UserModifyDTO userModifyDTO);

    UserInfoVO userInfo(Integer id);
}
