package com.trpg.version1.mybatis.dto.room;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data
 **/
@Data
public class UserRoomCharacterDTO {
    @NotNull(message = "010015")
    private Integer uid;

    @NotNull(message = "010029")
    private Integer rid;

    @NotNull(message = "010030")
    private Integer cid;
}
