package com.trpg.version1.controller.room;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.common.util.ResultCodeUtil;
import com.trpg.version1.mybatis.dto.ChatGroupDTO;
import com.trpg.version1.mybatis.dto.ChatMessageDTO;
import com.trpg.version1.mybatis.dto.UserDTO;
import com.trpg.version1.mybatis.dto.room.CharacterStatusDTO;
import com.trpg.version1.mybatis.dto.room.RoomCreateDTO;
import com.trpg.version1.mybatis.dto.room.UserRoomCharacterDTO;
import com.trpg.version1.mybatis.dto.room.UserRoomRoleDTO;
import com.trpg.version1.mybatis.entity.Room;
import com.trpg.version1.mybatis.entity.SysUser;
import com.trpg.version1.mybatis.vo.RoomUserLevelVO;
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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
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

    /**
     * @description: 创建房间
     * @author xuzih
     * @date 2021/6/12 19:52
     * @version 1.0
     */
    @RequestMapping(value = "/room/create/{uid}", method = RequestMethod.POST)
    public JsonMessage<RoomVO> createRoom(@PathVariable("uid") String uid, Room room){
        return new JsonMessage(webSocketService.createRoom(uid,room));
    }

    /**
     * @description: 删除房间
     * @author xuzih
     * @date 2021/6/12 19:52
     * @version 1.0
     */
    @RequestMapping(value = "/room/delete/{uid}/{rid}", method = RequestMethod.DELETE)
    public JsonMessage<RoomVO> deleteRoom(@PathVariable("uid") String uid, @PathVariable("rid") Integer rid){
        return new JsonMessage(webSocketService.deleteRoom(uid,rid));
    }

    /**
     * @description: 进入房间
     * @author xuzih
     * @date 2021/6/12 19:52
     * @version 1.0
     */
    @RequestMapping(value = "/room/enter/{uid}/{rid}", method = RequestMethod.GET)
    public JsonMessage<RoomVO> enterRoom(@PathVariable("uid") Integer uid, @PathVariable("rid") Integer rid){
        return new JsonMessage(webSocketService.enterRoom(uid,rid));
    }

    /**
     * @description: 创建聊天组
     * @author xuzih
     * @date 2021/6/12 19:52
     * @version 1.0
     */
    @RequestMapping(value = "/room/createChatGroup/{uid}", method = RequestMethod.POST)
    public JsonMessage<RoomVO> enterRoom(@RequestBody @Valid ChatGroupDTO chatGroupDTO, @PathVariable("uid") Integer uid){
        return new JsonMessage(webSocketService.createChatGroup(chatGroupDTO,uid));
    }


    /**
     * @description: 删除房间
     * @author xuzih
     * @date 2021/6/12 19:53
     * @version 1.0
     */
    @RequestMapping(value = "/room/delete/{rid}", method = RequestMethod.GET)
    public JsonMessage<RoomVO> deleteRoom(@PathVariable("rid") Integer rid){
        return new JsonMessage(webSocketService.getOnlineUsersList(rid));
    }

    /**
     * @description: 获得聊天组信息
     * @author xuzih
     * @date 2021/6/13 0:43
     * @version 1.0
     */
    @RequestMapping(value = "/room/getChatGroup", method = RequestMethod.POST)
    public JsonMessage<RoomVO> getChatGroup(@RequestBody List<Integer> chatId){
        return new JsonMessage(webSocketService.getChatGroupList(chatId));
    }


    /**
     * @description: 获得聊天组内成员信息
     * @author xuzih
     * @date 2021/6/13 0:43
     * @version 1.0
     */
    @RequestMapping(value = "/room/getChatPeople/{chatid}",method = RequestMethod.GET)
    public JsonMessage<List<SysUser>> getChatPeople(@PathVariable("chatid") Integer chatId){
        if(chatId == null){
            throw new OpException(ResultCode.EMPTY_CHATROOM_ID.getCode(),ResultCode.EMPTY_CHATROOM_ID.getDesc());
        }
        return new JsonMessage(webSocketService.getChatPeople(chatId));
    }

    /**
     * @description: 获得用户房间权限
     * @author xuzih
     * @date 2021/6/13 1:02
     * @version 1.0
     */
    @RequestMapping(value = "/room/getUserRoomRole/{uid}/{rid}",method = RequestMethod.GET)
    public JsonMessage<RoomUserLevelVO> getUserRoomRole(@PathVariable("uid") Integer uid, @PathVariable("rid") Integer rid){
        if(uid == null || rid == null){
            throw new OpException(ResultCode.EMPTY_CHATROOM_ID.getCode(),ResultCode.EMPTY_CHATROOM_ID.getDesc());
        }
        return new JsonMessage(webSocketService.getUserRoomAllInfo(uid,rid));
    }
    
    /**
     * @description: 获得房间内所有用户权限
     * @author xuzih
     * @date 2021/6/13 1:02
     * @version 1.0
     */
    @RequestMapping(value = "/room/getAllUserRoomRole/{uid}/{rid}",method = RequestMethod.GET)
    public JsonMessage<Integer> getAllUserRoomRole(@PathVariable("uid") Integer uid,@PathVariable("rid") Integer rid){
        if(uid == null || rid == null){
            throw new OpException(ResultCode.EMPTY_CHATROOM_ID.getCode(),ResultCode.EMPTY_CHATROOM_ID.getDesc());
        }
        return new JsonMessage(webSocketService.getAllUserRoomRole(uid,rid));
    }

    /**
     * @description: 修改房间内用户权限
     * @author xuzih
     * @date 2021/6/13 1:02
     * @version 1.0
     */
    @RequestMapping(value = "/room/setUserRoomRole/{uid}",method = RequestMethod.POST)
    public JsonMessage<String> setUserRoomRole(@RequestBody @Valid UserRoomRoleDTO userRoomRoleDTO, BindingResult bindingResult,
                                               @PathVariable(value = "uid")Integer uid){
        if(bindingResult.hasErrors()){
            ResultCode resultCode = ResultCodeUtil.getCodeFromBind(bindingResult);
            throw new OpException(resultCode.getCode(),resultCode.getDesc());
        }
        return new JsonMessage(webSocketService.setUserRoomRole(userRoomRoleDTO,uid));
    }

    /**
     * @description: 修改房间内玩家角色
     * @author xuzih
     * @date 2021/6/13 1:02
     * @version 1.0
     */
    @RequestMapping(value = "/room/setUserRoomCharacter/{uid}/{rid}",method = RequestMethod.POST)
    public JsonMessage<String> setUserRoomCharacter(@RequestBody @Valid UserRoomCharacterDTO userRoomCharacterDTO, BindingResult bindingResult,
                                                    @PathVariable(value = "uid")Integer uid){
        if(bindingResult.hasErrors()){
            ResultCode resultCode = ResultCodeUtil.getCodeFromBind(bindingResult);
            throw new OpException(resultCode.getCode(),resultCode.getDesc());
        }
        return new JsonMessage(webSocketService.setUserRoomCharacter(userRoomCharacterDTO,uid));
    }

    /**
     * @description: 修改角色属性
     * @author xuzih
     * @date 2021/6/13 1:02
     * @version 1.0
     */
    @RequestMapping(value = "/room/changeCharacterAttribute/{uid}/{{rid}}",method = RequestMethod.POST)
    public JsonMessage<String> changeCharacterAttribute(@RequestBody @Valid CharacterStatusDTO characterStatusDTO, BindingResult bindingResult,
                                                    @PathVariable(value = "uid")Integer uid, @PathVariable(value = "uid")Integer rid){
        if(bindingResult.hasErrors()){
            ResultCode resultCode = ResultCodeUtil.getCodeFromBind(bindingResult);
            throw new OpException(resultCode.getCode(),resultCode.getDesc());
        }
        return new JsonMessage(webSocketService.changeCharacterAttribute(characterStatusDTO,uid,rid));
    }

    /**
     * @description: 修改角色能力
     * @author xuzih
     * @date 2021/6/13 1:02
     * @version 1.0
     */
    @RequestMapping(value = "/room/changeCharacterAbility/{uid}",method = RequestMethod.POST)
    public JsonMessage<String> changeCharacterAbility(@RequestBody @Valid CharacterStatusDTO characterStatusDTO, BindingResult bindingResult,
                                                    @PathVariable(value = "uid")Integer uid, @PathVariable(value = "rid")Integer rid){
        if(bindingResult.hasErrors()){
            ResultCode resultCode = ResultCodeUtil.getCodeFromBind(bindingResult);
            throw new OpException(resultCode.getCode(),resultCode.getDesc());
        }
        return new JsonMessage(webSocketService.changeCharacterAbility(characterStatusDTO,uid,rid));
    }

    /**
     * @description: 发送信息
     * @author xuzih
     * @date 2021/6/13 0:44
     * @version 1.0
     */
    @MessageMapping("/send")
    public JsonMessage<String> sendMessage(@RequestBody ChatMessageDTO chatMessageDTO){
        webSocketService.send(chatMessageDTO);
        return new JsonMessage<>("发送成功");
    }

    /**
     * @description: 测试接口
     * @author xuzih
     * @date 2021/6/13 0:44
     * @version 1.0
     */
    @MessageMapping("/UserRoomCharacterMapper")
    public JsonMessage<String> sendMessageTest(ChatMessageDTO chatMessageDTO){
        logger.info(chatMessageDTO.getContent());
        webSocketService.sendTest(chatMessageDTO);
        return new JsonMessage<>("发送成功");
    }


//    @Scheduled(fixedRate = 5000)
//    public void sendMessage(){
//        logger.info("发送信息");
//        simpMessagingTemplate.convertAndSend("/topic/1","后端发送信息-测试");
//    }

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

