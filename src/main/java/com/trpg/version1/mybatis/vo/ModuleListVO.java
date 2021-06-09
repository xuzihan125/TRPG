package com.trpg.version1.mybatis.vo;

import com.trpg.version1.mybatis.entity.Module;
import lombok.Data;

@Data
public class ModuleListVO {
    private Integer mid;
    private String image_path;
    private String name;
    private String author;
    private String type;
    private String time_publish;
    private String describe;
    private String short_time;
    private String long_time;
    private String time_background;
    private String place_background;
    private String recommend_people;

    public ModuleListVO(Module module){
        mid = module.getMid();
        image_path = module.getFileurl();
        name = module.getName();
        type = module.getType();
        time_publish = module.getTimepublish();
        describe = module.getDescri();
        short_time = module.getShorttime();
        long_time = module.getLongtime();
        time_background = module.getTimebackground();
        place_background = module.getPlacebackground();
        recommend_people = module.getRecommendpeople();
    }
}
