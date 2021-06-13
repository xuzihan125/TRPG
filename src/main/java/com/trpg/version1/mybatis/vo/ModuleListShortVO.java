package com.trpg.version1.mybatis.vo;

import lombok.Data;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/13
 **/
@Data
public class ModuleListShortVO {
    private Integer mid;
    private String image_path;
    private String name;
    private String author;
    private String type;
    private String time_publish;
    private String dscri;
}
