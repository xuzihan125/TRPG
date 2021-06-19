package com.trpg.version1.service.Impl;

import com.trpg.version1.common.Enum.AbilityEnum;
import com.trpg.version1.common.Enum.AttributeEnum;
import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.mybatis.dao.*;
import com.trpg.version1.mybatis.daoExt.CharacterExt;
import com.trpg.version1.mybatis.dto.CreateCharacterDTO;
import com.trpg.version1.mybatis.entity.*;
import com.trpg.version1.mybatis.vo.AbilityVO;
import com.trpg.version1.mybatis.vo.AttributeVO;
import com.trpg.version1.mybatis.vo.CharacterVO;
import com.trpg.version1.service.CharacterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
    private CharacterExt characterExt;

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
        charactMapper.insert(charact);
        int cid = charact.getCharacterid();
        createCharacterDTO.getAttribute_List().forEach(e->{
            AttributeCharacter attributeCharacter = new AttributeCharacter();
            attributeCharacter.setNum(e.getNum());
            attributeCharacter.setCharacterid(cid);
            attributeCharacter.setAttributeid(AttributeEnum.getAid(e.getName()));
            attributeCharacter.setState(0);
            attributeCharacterMapper.insert(attributeCharacter);
        });
        createCharacterDTO.getAbilityList().stream().forEach(e->{
            Ability ability = new Ability();
            ability.setCharacterid(cid);
            ability.setNumlearn(e.getNumLearn());
            ability.setNumhobby(e.getNumHobby());
            ability.setNumpro(e.getNumPro());
            ability.setSkillid(AbilityEnum.getAid(e.getName()));
            ability.setState(0);
            abilityMapper.insert(ability);
        });
        return "创建成功";
    }

    @Override
    public List<Charact> getCharacterList(Integer uid) {
        CharactExample charactExample = new CharactExample();
        charactExample.createCriteria().andUseridEqualTo(uid);
        List<Charact> entityList = charactMapper.selectByExample(charactExample);
        return entityList;
    }

    @Override
    public CreateCharacterDTO getCharacter(Integer uid, Integer cid) {

        CharactExample charactExample = new CharactExample();
        charactExample.createCriteria().andCharacteridEqualTo(cid);
        List<Charact> entityList = charactMapper.selectByExample(charactExample);
        Charact entity = entityList.stream().findFirst().orElse(null);
        if(entity == null){
            throw new OpException(ResultCode.CHARACTER_NOT_EXIST.getCode(),ResultCode.CHARACTER_NOT_EXIST.getDesc());
        }
        CreateCharacterDTO result = new CreateCharacterDTO(entity.getCharacterid(),entity.getName(),
                entity.getSex(),entity.getAge(), entity.getTime(),entity.getResident(),entity.getHome());

        List<AttributeVO> attributeVOList = new ArrayList<>();
        AttributeCharacterExample example = new AttributeCharacterExample();
        example.createCriteria().andCharacteridEqualTo(entity.getCharacterid());
        List<AttributeCharacter> attributeCharacterList = attributeCharacterMapper.selectByExample(example);
        attributeCharacterList.forEach(e->{
            AttributeVO attributeVO = new AttributeVO();
            attributeVO.setName(AttributeEnum.getName(e.getAttributeid()));
            attributeVO.setNum(e.getNum());
            attributeVOList.add(attributeVO);
        });
        result.setAttribute_List(attributeVOList);

        List<AbilityVO> abilityVOList = characterExt.getAbility(entity.getCharacterid());
        result.setAbilityList(abilityVOList);
        return result;
    }
}
