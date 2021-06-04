package com.trpg.version1.common.Enum;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/31
 **/
public enum RoomRoleEnum {

    VIEWER(0,"观众"),
    PLAYER(1,"玩家"),
    HOST(2,"主持人");

    private int code;
    private String desc;

    RoomRoleEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc(){
        return desc;
    }

    public boolean checkLevel(int code){
        return code >= this.code;
    }
}
