package com.trpg.version1.common.Enum;

public enum TokenAttribute {
    USERNAME("username","user's username"),
    PASSWORD("password","user's password"),
    PHONE("phone","user's phone number"),
    NICKNAME("nickname","user's nickname"),
    ROLE("role","user's role");


    private String code;
    private String desc;

    TokenAttribute(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc(){
        return desc;
    }
}
