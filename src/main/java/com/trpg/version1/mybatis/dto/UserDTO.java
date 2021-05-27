package com.trpg.version1.mybatis.dto;

import com.trpg.version1.common.constrain.PhoneValid;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/23
 **/
@Data
public class UserDTO {
    @NotEmpty
    @Email(message = "邮件格式错误")
    private String email;

    @PhoneValid
    private String phone;

    @NotEmpty(message = "密码不能为空")
    @Length(max = 16, min = 6, message = "长度在6位~16位之间")
    private String password;

    @NotEmpty(message = "密码不能为空")
    @Length(max = 32, min = 6, message = "长度在6位~32位之间")
    private String nickname;
}
