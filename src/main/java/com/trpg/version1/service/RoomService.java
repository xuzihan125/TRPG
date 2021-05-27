package com.trpg.version1.service;

import com.trpg.version1.mybatis.dto.RoomSearchDTO;
import com.trpg.version1.mybatis.entity.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
    List<Room> getRoomPage(RoomSearchDTO roomSearchDTO);
}
