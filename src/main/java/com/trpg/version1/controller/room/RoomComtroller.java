package com.trpg.version1.controller.room;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.Enum.RoleEnum;
import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.mybatis.entity.Room;
import com.trpg.version1.service.RoomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/25
 **/
@Api(value = "房间控制")
@RestController
public class RoomComtroller {
    @Resource
    private RoomService roomService;

    @ApiOperation(value = "方法描述:获得房间列表,请求方式:GET,参数:String,返回值:JsonMessage<List<Room>>,是否可用:yes")
    @RequestMapping(value = "/room/get", method = RequestMethod.GET)
    public JsonMessage<List<Room>> getRoomPage(String match){
        return new JsonMessage<List<Room>>(roomService.getRoomPage(match));
    }

}
