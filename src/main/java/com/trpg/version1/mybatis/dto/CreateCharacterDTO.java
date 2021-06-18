package com.trpg.version1.mybatis.dto;

import com.trpg.version1.mybatis.entity.*;
import com.trpg.version1.mybatis.vo.AbilityVO;
import com.trpg.version1.mybatis.vo.AttributeVO;
import lombok.Data;

import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/14
 **/
@Data
public class CreateCharacterDTO {
    String c_name;
    String sex;
    String age;
    String time;
    String resident;
    String home;
    List<AttributeVO> attribute_List;
//    List<DescriptionCharacter> desc_form;
    List<AbilityVO> abilityList;
}
