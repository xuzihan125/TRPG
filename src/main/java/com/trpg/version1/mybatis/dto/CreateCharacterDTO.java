package com.trpg.version1.mybatis.dto;

import com.trpg.version1.mybatis.entity.*;
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
    List<AttributeCharacter> attribute_List;
    List<DescriptionCharacter> desc_form;
    List<Item> item_list;
    List<Ability> abilityList;
    String SHJZ; //伤害加值
}
