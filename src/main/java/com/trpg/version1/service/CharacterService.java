package com.trpg.version1.service;

import com.trpg.version1.mybatis.dto.CreateCharacterDTO;
import com.trpg.version1.mybatis.entity.Charact;
import com.trpg.version1.mybatis.vo.CharacterVO;

import java.util.List;

public interface CharacterService {
    public String createCharacter(Integer uid, CreateCharacterDTO createCharacterDTO);

    public List<CharacterVO> getCharacterList(Integer uid);

    public CharacterVO getCharacter(Integer uid, Integer cid);
}
