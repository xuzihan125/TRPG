package com.trpg.version1.mybatis.vo;

import lombok.Data;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/23
 **/
@Data
public class LoginVO {
    private Boolean status;
    private String nickname;
    private String token;
    private String emailAddress;
    private Integer uid;

    public LoginVO(String nickname, String token, String emailAddress, Integer uid) {
        this.status = true;
        this.nickname = nickname;
        this.token = token;
        this.emailAddress = emailAddress;
        this.uid = uid;
    }

    public LoginVO() {
        status = false;
    }
}
