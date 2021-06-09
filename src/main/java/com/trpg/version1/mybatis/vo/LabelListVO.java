package com.trpg.version1.mybatis.vo;

import com.trpg.version1.mybatis.entity.Label;
import lombok.Data;

@Data
public class LabelListVO {
    private Integer labelId;
    private String name;
    private String desc;

    public LabelListVO(Label label){
        labelId = label.getLabelid();
        name = label.getName();
        desc = label.getDescri();
    }
}
