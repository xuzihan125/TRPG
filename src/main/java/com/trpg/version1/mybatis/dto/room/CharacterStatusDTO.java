package com.trpg.version1.mybatis.dto.room;

import lombok.Data;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/13
 **/
@Data
public class CharacterStatusDTO {
    private Integer cid;
    private Integer aid;

    @DecimalMax(value = "100", message = "010031")
    @DecimalMin(value = "0", message = "010031")
    @NotNull(message = "010031")
    private Integer num;
}
