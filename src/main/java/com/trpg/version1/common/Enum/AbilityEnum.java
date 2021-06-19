package com.trpg.version1.common.Enum;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data
 **/
public enum AbilityEnum {

    CREDIT_RATING("信用评级",101),
    CREDIT("信用评级",102);

    private String name;
    private Integer aid;

    AbilityEnum(String name, Integer aid) {
        this.name = name;
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public Integer getAid() {
        return aid;
    }

    public static Integer getAid(String name){
        for(AbilityEnum entity:AbilityEnum.values()){
            if(entity.name.equals(name)){
                return entity.aid;
            }
        }
        return null;
    }

    public static String getName(Integer aid){
        for(AbilityEnum entity:AbilityEnum.values()){
            if(entity.aid==aid){
                return entity.name;
            }
        }
        return null;
    }
}
