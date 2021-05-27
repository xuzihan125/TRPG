package com.trpg.version1.mybatis.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/25
 **/
@Data
public class RoomSearchDTO {
    //页面长度
    @NotEmpty
    private int pageSize;

    //页数
    @NotEmpty
    private int pageNum;

    // 房间名称或房间描述
    private String context;

    //标签
    private List<Integer> labelIdList;

    //房间类型
    private String type;

    //游戏人数
    private int maxTime;
    private int minTime;

    //规则类型
    private String ruleType;

    //地点类型
    private String place;

    //时间类型
    private String age;

    //游戏人数
    private int maxPeople;
    private int minPeople;

}
