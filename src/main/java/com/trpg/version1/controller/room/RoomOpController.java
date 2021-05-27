package com.trpg.version1.controller.room;

import com.trpg.version1.common.JsonMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/27
 **/
@RestController(value = "房间内接口")
public class RoomOpController {
    @RequestMapping(value = "/room/{id}/enter")
    public JsonMessage<String> enterRoom(){
        return new JsonMessage<String>("123");
    }
}
