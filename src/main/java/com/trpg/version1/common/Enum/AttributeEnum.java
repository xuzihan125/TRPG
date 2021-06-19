package com.trpg.version1.common.Enum;

public enum AttributeEnum {
    STR(1,"力量"),
    CON(2,"体质"),
    SIZ(3,"体型"),
    DEX(4,"敏捷"),
    APP(5,"外貌"),
    INT(6,"智力"),
    POW(7,"意志"),
    EDU(8,"教育"),
    LUCK(9,"幸运"),
    HP(10,"血量"),
    MP(11,"魔力"),
    SAN(12,"理智");



    private Integer aid;
    private String name;

    AttributeEnum(Integer aid, String name) {
        this.aid = aid;
        this.name = name;
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
                return entity.name;
            }
        }
        return null;
    }

}
