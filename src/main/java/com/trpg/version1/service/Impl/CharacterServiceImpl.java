package com.trpg.version1.service.Impl;

import com.trpg.version1.common.Enum.AbilityEnum;
import com.trpg.version1.common.Enum.AttributeEnum;
import com.trpg.version1.mybatis.dao.*;
import com.trpg.version1.mybatis.dto.CreateCharacterDTO;
import com.trpg.version1.mybatis.entity.Ability;
import com.trpg.version1.mybatis.entity.AttributeCharacter;
import com.trpg.version1.mybatis.entity.Charact;
import com.trpg.version1.service.CharacterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/14
 **/
@Service
public class CharacterServiceImpl implements CharacterService {
    @Resource
    private CharactMapper charactMapper;

    @Resource
    private AbilityMapper abilityMapper;

    @Resource
    private AttributeCharacterMapper attributeCharacterMapper;

    @Resource
    private DescriptionCharacterMapper desccriptionCharacterMapper;

    @Resource
    private ItemMapper itemMapper;

    @Override
    public String createCharacter(Integer uid, CreateCharacterDTO createCharacterDTO) {
        Charact charact = new Charact();
        charact.setUserid(uid);
        charact.setName(createCharacterDTO.getC_name());
        charact.setAge(createCharacterDTO.getAge());
        charact.setSex(createCharacterDTO.getSex());
        charact.setTime(createCharacterDTO.getTime());
        charact.setResident(createCharacterDTO.getResident());
        charact.setHome(createCharacterDTO.getHome());
        charact.setState(0);
        int cid = charactMapper.insert(charact);
        createCharacterDTO.getAttribute_List().forEach(e->{
            AttributeCharacter attributeCharacter = new AttributeCharacter();
            attributeCharacter.setNum(e.getNum());
            attributeCharacter.setCharacterid(cid);
            attributeCharacter.setAttributeid(AttributeEnum.getAid(e.getName()));
            attributeCharacterMapper.insert(attributeCharacter);
        });
        createCharacterDTO.getAbilityList().stream().forEach(e->{
            Ability ability = new Ability();
            ability.setCharacterid(cid);
            ability.setNumlearn(e.getNumLearn());
            ability.setNumhobby(e.getNumHobby());
            ability.setNumpro(e.getNumPro());
            ability.setSkillid(AbilityEnum.getAid(e.getName()));
            abilityMapper.insert(ability);
        });
        return "创建成功";
    }
}
