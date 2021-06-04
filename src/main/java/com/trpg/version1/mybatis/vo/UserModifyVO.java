package com.trpg.version1.mybatis.vo;

import lombok.Data;

/**
 * @author eryo
 * @version 1.0
 * @description: 修改用户信息，包括邮箱，电话号码，昵称和微信号以及描述
 * @data 2021/5/23
 */
@Data
public class UserModifyVO {
    private String email;
    private String phone;
    private String nickname;
    private String wechatid;
    private String descri;
}
