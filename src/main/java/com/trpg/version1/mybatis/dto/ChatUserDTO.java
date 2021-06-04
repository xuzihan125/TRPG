package com.trpg.version1.mybatis.dto;

import lombok.Data;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/30
 **/
@Data
public class ChatUserDTO {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 连接时间
     */
    private String createTime;
}
