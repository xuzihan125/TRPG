package com.trpg.version1.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.websocket.Session;
import java.time.LocalDateTime;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/30
 **/
@Data
@AllArgsConstructor
public class OnlineUser{
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户会话 (使用该对象进行消息发送)
     */
    private Session session;
    /**
     * 连接时间
     */
    private String createTime;

    /**
     * @param userId   用户id
     * @param session  用户session 回话信息
     */
    public OnlineUser(String userId, Session session) {
        this.userId = userId;
        this.session = session;
        this.createTime = LocalDateTime.now().toString();
    }
}
