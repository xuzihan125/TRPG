package com.trpg.version1.mybatis.dto;

import lombok.Data;

import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/31
 **/
@Data
public class ChatGroupDTO {
    private Integer rid;
    private List<Integer> uid;
}
