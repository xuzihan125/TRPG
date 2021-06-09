package com.trpg.version1.mybatis.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class ModuleUploadDTO {
    /*
        EMPTY_UID("010015", "userId不能为空"),
        EMPTY_MODULE_NAME("010016", "模组名称不能为空"),
        EMPTY_MODULE_DESCRIPTION("010017", "模组描述不能为空"),
        EMPTY_MODULE_TYPE("010018", "模组类型不能为空"),
        EMPTY_MODULE_SHORT_TIME("010019", "short time不能为空"),
        EMPTY_MODULE_LONG_TIME("010020", "long time不能为空"),
        EMPTY_MODULE_RULE_TYPE("010021", "rule type不能为空"),
        EMPTY_MODULE_TIME_BACKGROUND("010022", "时间背景不能为空"),
        EMPTY_MODULE_PLACE_BACKGROUND("010023", "地点背景不能为空"),
        EMPTY_RECOMMEND_PEOPLE("010024", "推荐人群不能为空"),
        EMPTY_MODULE_PIC_PATH("010025", "图片路径不能为空"),
     */
    //@NotEmpty(message = "010015")
    private Integer uid;

    @NotEmpty(message = "010016")
    private String name;

    @NotEmpty(message = "010017")
    private String Desc;

    private List<Integer> label;

    @NotEmpty(message = "010018")
    private String type;

    @NotEmpty(message = "010019")
    private String short_time;

    @NotEmpty(message = "010020")
    private String long_time;

    @NotEmpty(message = "010021")
    private String rule_type;

    @NotEmpty(message = "010022")
    private String time_background;

    @NotEmpty(message = "010023")
    private String place_background;

    @NotEmpty(message = "010024")
    private String recommend_people;

    @NotEmpty(message = "010025")
    private String pic_path;
}
