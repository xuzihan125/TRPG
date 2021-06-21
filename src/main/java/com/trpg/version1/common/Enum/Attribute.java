package com.trpg.version1.common.Enum;

public enum Attribute {
    STR("力量",1,"STR"),
    CON("体质",2,"CON"),
    SIZ("体型",3,"SIZ"),
    DEX("敏捷",4,"DEX"),
    APP("外貌",5,"APP"),
    INT("智力",6,"INT"),
    POW("意志",7,"POW"),
    EDU("教育",8,"EDU"),
    LUCK("幸运",9,"LUCK"),
    HP("体力",10,"hp"),
    MP("魔力",11,"mp"),
    SAN("理智",12,"san")
    ;

    private String content;
    private Integer code;
    private String text;

    Attribute(String content, Integer code, String text) {
        this.content = content;
        this.code = code;
        this.text = text;
    }

    public String getContent() {
        return content;
    }

    public Integer getCode() {
        return code;
    }
}
