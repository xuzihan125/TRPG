package com.trpg.version1.mybatis.daoExt;

import com.trpg.version1.mybatis.vo.AbilityVO;
import com.trpg.version1.mybatis.vo.ModuleListShortVO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CharacterExt{
    @Select("SELECT * FROM `ability` as ab JOIN skill as s ON s.skillId=ab.skillId where ab.characterId=#{cid}")
    @Results(id = "AbilityVO", value = {
            @Result(column = "name", property = "name"),
            @Result(column = "numDefault", property = "numDefault"),
            @Result(column = "numPro", property = "numPro"),
            @Result(column = "numHobby", property = "numHobby"),
            @Result(column = "numLearn", property = "numLearn"),
    })
    List<AbilityVO> getAbility(Integer cid);
}
