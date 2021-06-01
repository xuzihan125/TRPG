//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.annotation.SendToUser;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.security.Principal;
//
//@Controller
//@RequestMapping("/webSocket")
//@MessageMapping("foo")
//public class WebSocketController {
//
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
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////package com.trpg.version1.controller.room;
////
////import com.trpg.version1.common.JsonMessage;
////import com.trpg.version1.mybatis.dto.ChatMessageDTO;
////import org.springframework.messaging.handler.annotation.MessageMapping;
////import org.springframework.messaging.handler.annotation.Payload;
////import org.springframework.messaging.handler.annotation.SendTo;
////import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
////import org.springframework.stereotype.Controller;
////import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RestController;
////
/////**
//// * @author xuzihan
//// * @version 1.0
//// * @description: TODO
//// * @data 2021/5/27
//// **/
////@RestController(value = "房间内接口")
////public class RoomOpController {
////    @MessageMapping("/{rid}/{uid}/sendMessage")
////    @SendTo("/topic/public")//发送目的地
////    public JsonMessage<String> sendMessage(){
////        return null;
////    }
////
////    @MessageMapping("/chat.addUser")//"/send/chat.addUser"
////    @SendTo("/topic/public")
////    public ChatMessageDTO addUser(@Payload ChatMessageDTO chatMessage,
////                               SimpMessageHeaderAccessor headerAccessor) {
////        // Add username in web socket session
////        headerAccessor.getSessionAttributes().put("username", chatMessage.getSenderUid());
////        return chatMessage;
////    }
////}
