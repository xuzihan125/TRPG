package com.trpg.version1.service.Impl;

import com.trpg.version1.mybatis.dao.*;
import com.trpg.version1.mybatis.dto.CreateCharacterDTO;
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
        charact.setName(createCharacterDTO.getC_name());
        charact.setDemage(createCharacterDTO.getSHJZ());
        charact.setUserid(uid);
        charact.setState(0);
        int cid = charactMapper.insert(charact);
//        createCharacterDTO.get
        createCharacterDTO.getAbilityList().stream().forEach(e->{
            e.setCharacterid(cid);
            abilityMapper.insert(e);
        });
        createCharacterDTO.getAttribute_List().stream().forEach(e->{e.setCharacterid(cid);attributeCharacterMapper.insert(e);});
        createCharacterDTO.getDesc_form().stream().forEach(e->{e.setCharacterid(cid);desccriptionCharacterMapper.insert(e);});
        createCharacterDTO.getItem_list().stream().forEach(e->{e.setCharacterid(cid);itemMapper.insert(e);});
        return "创建成功";
    }
}
