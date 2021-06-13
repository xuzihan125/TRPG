package com.trpg.version1.service.Impl;

import com.github.pagehelper.PageHelper;
import com.trpg.version1.mybatis.dao.RoomMapper;
import com.trpg.version1.mybatis.entity.Room;
import com.trpg.version1.mybatis.entity.RoomExample;
import com.trpg.version1.service.RoomService;
import com.trpg.version1.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/25
 **/
@Service
public class RoomServiceImpl implements RoomService {
    @Resource
    private RoomMapper roomMapper;

    @Override
    public List<Room> getRoomPage(String match) {
        if(match == null){
            match = "";
        }
        match = "%" +match +"%";
        RoomExample example = new RoomExample();
        example.or().andNameLike(match);
        example.or().andDescriLike(match);
        example.or().andTypeLike(match);
        List<Room> result = roomMapper.selectByExample(example);
        return result;
    }
}
