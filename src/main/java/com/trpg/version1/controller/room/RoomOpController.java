package com.trpg.version1.controller.room;

import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.mybatis.dto.ChatMessageDTO;
import com.trpg.version1.mybatis.dto.room.RoomCreateDTO;
import com.trpg.version1.mybatis.entity.Room;
import com.trpg.version1.mybatis.vo.RoomVO;
import com.trpg.version1.service.Impl.WebSocketServiceImpl;
import com.trpg.version1.service.WebSocketService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.security.Principal;
import java.util.List;


@Api(value = "房间操作")
@RestController
//@MessageMapping("foo")
public class RoomOpController {

    private Logger logger = LoggerFactory.getLogger(RoomOpController.class);

    @Resource
    SimpMessagingTemplate simpMessagingTemplate;

    @Resource
    WebSocketService webSocketService;

    @RequestMapping(value = "/room/create/{uid}", method = RequestMethod.POST)
    public JsonMessage<RoomVO> createRoom(@PathVariable("uid") String uid, Room room){
        return new JsonMessage(webSocketService.createRoom(uid,room));
    }

    @RequestMapping(value = "/room/delete/{uid}/{rid}", method = RequestMethod.DELETE)
    public JsonMessage<RoomVO> deleteRoom(@PathVariable("uid") String uid, @PathVariable("rid") Integer rid){
        return new JsonMessage(webSocketService.deleteRoom(uid,rid));
    }

    @RequestMapping(value = "/room/enter/{uid}/{rid}", method = RequestMethod.GET)
    public JsonMessage<RoomVO> enterRoom(@PathVariable("uid") Integer uid, @PathVariable("rid") Integer rid){
        return new JsonMessage(webSocketService.enterRoom(uid,rid));
    }

    @RequestMapping(value = "/room/delete/{rid}", method = RequestMethod.GET)
    public JsonMessage<RoomVO> createRoom(@PathVariable("rid") Integer rid){
        return new JsonMessage(webSocketService.getOnlineUsersList(rid));
    }

    @RequestMapping(value = "/room/getChatGroup", method = RequestMethod.POST)
    public JsonMessage<RoomVO> createRoom(@RequestBody List<Integer> chatId){
        return new JsonMessage(webSocketService.getChatGroupList(chatId));
    }

    @MessageMapping("/send")
    public JsonMessage<String> sendMessage(@RequestBody ChatMessageDTO chatMessageDTO){
        webSocketService.send(chatMessageDTO);
        return new JsonMessage<>("发送成功");
    }

    @MessageMapping("/test")
    public JsonMessage<String> sendMessageTest(ChatMessageDTO chatMessageDTO){
        logger.info(chatMessageDTO.getContent());
        webSocketService.sendTest(chatMessageDTO);
        return new JsonMessage<>("发送成功");
    }


    @Scheduled(fixedRate = 5000)
    public void sendMessage(){
        logger.info("发送信息");
        simpMessagingTemplate.convertAndSend("/topic/1","后端发送信息-测试");
    }

//    /**
//     * 精准推送
//     * @param msg
//     * @param principal
//     * @return
//     */
//    @MessageMapping("handle1")
//    @SendToUser(value = "/topic/greetings1",broadcast = false)
//    public String handle1(String msg,Principal principal) {
//
//        return "精准推送，只推送到" + principal.getName();
//    }
//
//
//    /**
//     * 广播推送
//     * @param msg
//     * @param principal
//     * @return
//     */
//    @MessageMapping("handle2")
//    @SendTo("topic/greetings2")
//    public String handle2(String msg, Principal principal) {
//
//        return "广播推送，所有用户都收得到";
//    }
}




























//package com.trpg.version1.controller.room;
//
//import com.trpg.version1.common.JsonMessage;
//import com.trpg.version1.mybatis.dto.ChatMessageDTO;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author xuzihan
// * @version 1.0
// * @description: TODO
// * @data 2021/5/27
// **/
//@RestController(value = "房间内接口")
//public class RoomOpController {
//    @MessageMapping("/{rid}/{uid}/sendMessage")
//    @SendTo("/topic/public")//发送目的地
//    public JsonMessage<String> sendMessage(){
//        return null;
//    }
//
//    @MessageMapping("/chat.addUser")//"/send/chat.addUser"
//    @SendTo("/topic/public")
//    public ChatMessageDTO addUser(@Payload ChatMessageDTO chatMessage,
//                               SimpMessageHeaderAccessor headerAccessor) {
//        // Add username in web socket session
//        headerAccessor.getSessionAttributes().put("username", chatMessage.getSenderUid());
//        return chatMessage;
//    }
//}
