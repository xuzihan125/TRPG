package com.trpg.version1.mybatis.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/18
 **/
@Data
public class LoginDTO {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
