package com.trpg.version1.mybatis.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/19
 **/
@Data
public class CharacterVO {
    Integer cid;
    String c_name;
    String sex;
    String age;
    String time;
    String resident;
    String home;
    Map<String,Integer> attribute;
    List<AbilityVO> ability;

    public CharacterVO(Integer cid,String c_name, String sex, String age, String time, String resident, String home) {
        this.cid = cid;
        this.c_name = c_name;
        this.sex = sex;
        this.age = age;
        this.time = time;
        this.resident = resident;
        this.home = home;
    }

    public CharacterVO(){

    }
}
