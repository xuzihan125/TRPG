package com.trpg.version1.service;

import com.trpg.version1.mybatis.dto.LoginDTO;
import com.trpg.version1.mybatis.dto.UserDTO;
import com.trpg.version1.mybatis.vo.LoginVO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    String createUser(UserDTO dto);

    LoginVO login(LoginDTO loginDTO);
}
