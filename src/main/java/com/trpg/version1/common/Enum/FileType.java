package com.trpg.version1.common.Enum;

public enum FileType {

    MODULE("module","模组","module/"),
    DEFAULT("default","默认","default/"),
    MAP("map","地图","map/"),
    COVER("cover","模组封面","cover/");

    private String type;
    private String desc;
    private String dir;


    private FileType(String type, String desc,String dir){
        this.type = type;
        this.desc = desc;
        this.dir = dir;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
    public String getDir() {
        return dir;
    }
}
