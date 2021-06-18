package com.trpg.version1.mybatis.daoExt;

import com.trpg.version1.mybatis.vo.RoomUserLevelVO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserRoomCharacterMapper {
    @Select("SELECT r.`level`, u.nickname, u.userId, cr.characterId, d.content FROM `roomUser` AS r " +
            "LEFT JOIN sys_user AS u ON u.userId = r.userId LEFT JOIN characterRoom cr ON cr.userId=r.userId " +
            "LEFT JOIN descriptionCharacter AS d on d.characterId = cr.characterId WHERE r.roomId = #{uid} " +
            "AND (descriptionId = 1 or descriptionId is null)")
    @Results(id = "RoomUserLevelVO", value = {
            @Result(column = "level", property = "level"),
            @Result(column = "nickname", property = "userName"),
            @Result(column = "userId", property = "uid"),
            @Result(column = "context", property = "characterName"),
            @Result(column = "characterId", property = "cid"),
    })
    List<RoomUserLevelVO> getUserRoleByRid(int rid);

    @Select("SELECT r.`level`, u.nickname, u.userId, cr.characterId, d.context FROM `roomUser` AS r " +
            "LEFT JOIN sys_user AS u ON u.userId = r.userId LEFT JOIN characterRoom cr ON cr.userId=r.userId " +
            "LEFT JOIN descriptionCharacter AS d on d.characterId = cr.characterId WHERE r.roomId = #{rid} " +
            "AND (descriptionId = 1 or descriptionId is null) AND u.userId = #{uid}")
    @ResultMap(value = "RoomUserLevelVO")
    List<RoomUserLevelVO> getUserRole(int rid, int uid);
}
