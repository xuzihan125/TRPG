package com.trpg.version1.mybatis.dto;

import com.trpg.version1.common.constrain.PhoneValid;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserModifyDTO {
    //EMPTY_EMAIL("010003", "邮箱不能为空")
    //WRONGFORMAT_EMAIL("010006", "邮箱格式错误")
    //EMPTY_PHONE("010009", "电话号码为空"),
    //WRONGFORMAT_PHONE("010010", "电话号码格式错误")
    //EMPTY_NICKNAME("010011", "昵称不能为空"),
    //WRONGFORMAT_NICKNAME("010012", "昵称长度必须在6到32之间"),
    //EMPTY_WECHATID("010013", "微信号不能为空"),
    //EMPTY_DESCRI("010014", "描述不能为空"),
//    @NotEmpty(message = "010015")
    @NotNull(message = "010015")
    private Integer uid;

    @NotEmpty(message = "010003")
    @Email(message = "010006")
    private String email;

    @NotEmpty(message = "010009")
    @PhoneValid(message = "010010")
    private String phone;

    @NotEmpty(message = "010011")
    @Length(max = 32, min = 6, message = "010012")
    private String nickname;

    @NotEmpty(message = "010013")
    private String wechatid;

    @NotEmpty(message = "010014")
    private String descri;
}
