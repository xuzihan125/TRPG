package com.trpg.version1.common.Enum;

public enum AttributeEnum {
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
    SAN("理智",12,"san");



    private Integer aid;
    private String name;
    private String text;

    AttributeEnum( String name,Integer aid,String text) {
        this.aid = aid;
        this.name = name;
        this.text = text;
    }

    public static Integer getAid(String name){
        for(AttributeEnum entity:AttributeEnum.values()){
            if(entity.name.equals(name)){
                return entity.aid;
            }
        }
        return null;
    }

    public static String getName(Integer aid){
        for(AttributeEnum entity:AttributeEnum.values()){
            if(entity.aid == aid){
                return entity.text;
            }
        }
        return null;
    }

}
