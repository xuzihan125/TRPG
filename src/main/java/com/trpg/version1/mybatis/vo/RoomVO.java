package com.trpg.version1.mybatis.vo;

import lombok.Data;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/31
 **/
@Data
public class RoomVO {
    Integer rid;
    Integer chatId;

    public RoomVO(Integer rid, Integer chatId) {
        this.rid = rid;
        this.chatId = chatId;
    }
}
