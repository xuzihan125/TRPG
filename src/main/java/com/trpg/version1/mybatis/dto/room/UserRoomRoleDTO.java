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
public class UserRoomRoleDTO {
//    @NotEmpty(message = "010015")
    private Integer uid;

//    @NotEmpty(message = "010029")
    private Integer rid;

//    @NotEmpty(message = "010030")
    private Integer level;
}