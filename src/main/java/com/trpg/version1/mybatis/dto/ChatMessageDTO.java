package com.trpg.version1.mybatis.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/29
 **/
@Data
public class ChatMessageDTO {
    private String name;
    private String cid;
    private String senderUid;
    private String content;
    private String targetChatId;
    private String time;
}
