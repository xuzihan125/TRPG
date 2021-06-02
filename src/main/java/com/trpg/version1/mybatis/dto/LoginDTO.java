package com.trpg.version1.mybatis.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/18
 **/
@Data
public class LoginDTO {
    @NotEmpty(message = "010003")
    @Email(message = "010006")
    private String email;
    @NotEmpty(message = "010004")
    private String password;
}
