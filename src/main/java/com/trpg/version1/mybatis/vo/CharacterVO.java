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
    String name;
    Map<String,Integer> attribute;
    List<AbilityVO> ability;
}
