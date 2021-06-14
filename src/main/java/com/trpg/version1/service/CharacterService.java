package com.trpg.version1.service;

import com.trpg.version1.mybatis.dto.CreateCharacterDTO;

public interface CharacterService {
    public String createCharacter(Integer uid, CreateCharacterDTO createCharacterDTO);
}
