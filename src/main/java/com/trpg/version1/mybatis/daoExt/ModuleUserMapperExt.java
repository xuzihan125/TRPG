package com.trpg.version1.mybatis.daoExt;

import com.trpg.version1.mybatis.vo.ModuleListShortVO;
import com.trpg.version1.mybatis.vo.RoomUserLevelVO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/13
 **/
public interface ModuleUserMapperExt {

    @Select("SELECT m.mid, m.coverUrl, m.name, s.nickname, m.type, m.timePublish, m.descri FROM `module` AS m " +
            "JOIN sys_user as s on m.userId = s.userId where m.name LIKE #{match} or m.type LIKE #{match} " +
            "or m.descri LIKE #{match} or s.nickname LIKE #{match}")
    @Results(id = "ModuleListShortVO", value = {
            @Result(column = "mid", property = "mid"),
            @Result(column = "coverUrl", property = "image_path"),
            @Result(column = "name", property = "name"),
            @Result(column = "nickname", property = "author"),
            @Result(column = "type", property = "type"),
            @Result(column = "timePublish", property = "time_publish"),
            @Result(column = "descri", property = "dscri"),
    })
    List<ModuleListShortVO> getModuleList(String match);
}
