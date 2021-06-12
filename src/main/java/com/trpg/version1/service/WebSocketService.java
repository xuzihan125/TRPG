package com.trpg.version1.service;

import com.trpg.version1.mybatis.dto.ChatGroupDTO;
import com.trpg.version1.mybatis.dto.ChatMessageDTO;
import com.trpg.version1.mybatis.dto.ChatUserDTO;
import com.trpg.version1.mybatis.entity.ChatGroup;
import com.trpg.version1.mybatis.entity.Room;
import com.trpg.version1.mybatis.vo.RoomVO;

import javax.websocket.Session;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @description: TODO
 * @author xuzih
 * @date 2021/5/29 16:46
 * @version 1.0
 *
 * 用户进入房间
 * 获得聊天窗口列表
 * 获得聊天内的人员列表
 * 获得聊天窗口内的信息列表
 * 发送信息
 * 用户离开房间
 * 异常停止
 */


public interface WebSocketService {
    //================================================================================
    //================================================================================
    //===============================  监听方法 =======================================
    //================================================================================
    //================================================================================

//    /**
//     * TODO  监听连接（有用户连接，立马到来执行这个方法），session 发生变化
//     *
//     * @param userId   用户id
//     * @param session  当前用户会话
//     * @return void
//     * @date 2020/6/30 0030 9:28
//     */
//    public void onOpen(@PathParam("userId") String userId, Session session);
//
//
//    /**
//     * TODO  监听断开连接（有用户退出，会立马到来执行这个方法）
//     *
//     * @param userId   用户id
//     * @param session  当前用户会话
//     */
//    public void onClose(@PathParam("userId") String userId, Session session);
//
//
//    /**
//     * TODO 异常停止
//     *
//     * @param userId   用户id
//     * @param session  当前用户会话
//     * @param error    异常信息
//     */
//    public void onError(@PathParam("userId") String userId, Session session, Throwable error);

//    /**
//     * TODO 监听消息发送（收到客户端的消息立即执行）
//     *
//     * @param userId   用户id
//     * @param message  传递的消息内容, json数据( to=接收人用户Id  (目标ID,逗号分隔) || content=内容)
//     * @param session  当前用户会话
//     *
//     *                 <p>
//     *                 // 前端发送内容格式
//     *                 ....
//     *                 // 拼接参数
//     *                 let message = { "content": content, "to": to };
//     *                 // 发送数据
//     *                 webSocket.send(JSON.stringify(message));
//     *                 ....
//     *                 </P>
//     */
//    public void onMessage(@PathParam("userId") String userId, String message, Session session);


    public void send(ChatMessageDTO chatMessageDTO);

    public void sendTest(ChatMessageDTO ChatMessageDTO);

    //================================================================================
    //================================================================================
    //=======================  service方法(http接口调用操作) ============================
    //================================================================================
    //================================================================================

    public RoomVO createRoom(String uid, Room room);

    public String deleteRoom(String uid,Integer rid);

    public Integer createChatGroup(ChatGroupDTO chatGroupDTO, Integer uid);

    public Integer enterRoom(Integer uid,Integer rid);

    public List<ChatGroup> getChatGroupList(List<Integer> chatGroupId);

    /**
     * 获取当前在线用户列表
     *
     * @return
     */
    public List<Integer> getOnlineUsersList(Integer rid);

    //    /**
//     * 获取当前在线人数
//     *
//     * @return
//     */
////    public Integer getOnlineCount(String rid);


//    /**
//     * 发送消息
//     *
//     * @param form     发送人id
//     * @param username 发送人用户名
//     * @param to       接收人id（多个逗号分隔）
//     * @param content  发送内容
//     * @param extras  扩暂发送内容
//     * @return
//     */
//    public List<ChatUserDTO> send(ChatMessageDTO chatMessageDTO);
}
