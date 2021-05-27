package com.trpg.version1.mybatis.dto;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/18
 **/
@Data
public class AuthDTO {
    private String username;

    private String password;

    private Collection<? extends GrantedAuthority> authorities;
}
