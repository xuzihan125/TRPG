package com.trpg.version1.common.Enum;

public enum Attribute {
    STR("力量",1),
    CON("体质",2),
    SIZ("体型",3),
    DEX("敏捷",4),
    APP("外貌",5),
    INT("智力",6),
    POW("意志",7),
    EDU("教育",8),
    LUCK("幸运",9),
    HP("体力",10),
    MP("魔力",11),
    SAN("理智",12)
    ;

    private String content;
    private Integer code;

    Attribute(String content, Integer code) {
        this.content = content;
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public Integer getCode() {
        return code;
    }
}
