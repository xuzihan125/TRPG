package com.trpg.version1.mybatis.dto.room;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data
 **/
@Data
public class InfoBoardDTO {
    @NotEmpty
    private String title;

    private String content;
}
