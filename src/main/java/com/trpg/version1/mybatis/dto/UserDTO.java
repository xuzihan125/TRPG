package com.trpg.version1.mybatis.dto;

import com.trpg.version1.common.constrain.PhoneValid;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @author xuzihan
 * @version 1.0
 * @description: 注册使用，传入参数为邮箱，密码和确认密码
 * @data 2021/5/23
 **/
@Data
public class UserDTO {
    //EMPTY_EMAIL("010003", "邮箱不能为空")
    //WRONGFORMAT_EMAIL("010006", "邮箱格式错误")
    //EMPTY_PASSWORD("010004", "密码不能为空"),
    //EMPTY_REPASSWORD("010005", "确认密码不能为空")
    //WRONGFORMAT_PASSWORD("010007", "密码长度需要在6到16位之间")
    //EMPTY_PHONE("010009", "电话号码为空"),
    //WRONGFORMAT_PHONE("010010", "电话号码格式错误")
    //EMPTY_NICKNAME("010011", "昵称不能为空"),
    //WRONGFORMAT_NICKNAME("010012", "昵称长度必须在6到32之间"),
    @NotEmpty(message = "010003")
    @Email(message = "010006")
    private String email;

    @NotEmpty(message = "010009")
    @PhoneValid(message = "010010")
    private String phone;

    @NotEmpty(message = "010004")
    @Length(max = 16, min = 6, message = "010007")
    private String password;

    @NotEmpty(message = "010005")
    private String repassword;

    @NotEmpty(message = "010011")
    @Length(max = 32, min = 6, message = "010012")
    private String nickname;
}
