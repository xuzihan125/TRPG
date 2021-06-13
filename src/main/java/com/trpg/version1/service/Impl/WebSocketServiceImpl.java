package com.trpg.version1.service.Impl;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.Enum.RoomRoleEnum;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.mybatis.dao.*;
import com.trpg.version1.mybatis.daoExt.UserRoomCharacterMapper;
import com.trpg.version1.mybatis.dto.ChatGroupDTO;
import com.trpg.version1.mybatis.dto.ChatMessageDTO;
import com.trpg.version1.mybatis.dto.room.CharacterStatusDTO;
import com.trpg.version1.mybatis.dto.room.InfoBoardDTO;
import com.trpg.version1.mybatis.dto.room.UserRoomCharacterDTO;
import com.trpg.version1.mybatis.dto.room.UserRoomRoleDTO;
import com.trpg.version1.mybatis.entity.*;
import com.trpg.version1.mybatis.vo.RoomUserLevelVO;
import com.trpg.version1.mybatis.vo.RoomVO;
import com.trpg.version1.service.WebSocketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/29
 **/
@Service
//@ServerEndpoint("/chatRoom")
public class WebSocketServiceImpl implements WebSocketService {
    /**
     * 在线人数  //使用原子类AtomicInteger, --->  static并发会产生线程安全问题，    //public  static Integer onlineNumber = 0;
     */
//    private static Map<String, AtomicInteger> rooms = new ConcurrentHashMap<>();
//    public static AtomicInteger onlineNumber = new AtomicInteger(0);
    /**
     * 所有用户信息(session + userId + username + createTime  --> 以用户的id为key, 通过用户key来获取用户session进行消息发送)
     */
//    public static Map<String, OnlineUser> clients = new ConcurrentHashMap<>();

//    private static String dir="/user/{}";

    public static Logger logger = LoggerFactory.getLogger(WebSocketServiceImpl.class);
    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;

    @Resource
    private RoomMapper roomMapper;

    @Resource
    private ChatGroupMapper chatGroupMapper;

    @Resource
    private ChatUserMapper chatUserMapper;

    @Resource
    private RoomUserMapper roomUserMapper;

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private UserRoomCharacterMapper userRoomCharacterMapper;

    @Resource
    private CharactMapper charactMapper;

    @Resource
    private CharacterRoomMapper characterRoomMapper;

    @Resource
    private AbilityMapper abilityMapper;

    @Resource
    private AttributeCharacterMapper attributeCharacterMapper;

    @Resource
    private InfoBoardMapper infoBoardMapper;
//    private

//    public static Map<String, List<String>> roomChat = new ConcurrentHashMap<>();
//
//    //id, level
//    public static Map<String, List<RoomUser>> roomUser = new ConcurrentHashMap<>();
//
//    public static Map<String, List<String>> chatUser = new ConcurrentHashMap<>();


    //================================================================================
    //================================================================================
    //===============================  监听方法 =======================================
    //================================================================================
    //================================================================================
//
//    /**
//     * TODO  监听连接（有用户连接，立马到来执行这个方法），session 发生变化
//     */
//    @OnOpen
//    public void onOpen(Session session) {
//        // 保存新用户id,用户名,session会话,登录时间
//        logger.info("建立监听");
//    }
//
//
//    /**
//     * TODO  监听断开连接（有用户退出，会立马到来执行这个方法）
//     */
//    @OnClose
//    public void onClose(Session session) {
//        // 所有在线用户中去除下线用户
//        logger.info("断开监听");
//    }
//
//    /**
//     * TODO 异常停止
//     */
//    @OnError
//    public void onError(Session session, Throwable error) {
//        logger.info("异常停止");
//    }
//
//    /**
//     * TODO 监听消息发送（收到客户端的消息立即执行）
//     */
//    @OnMessage
//    public void onMessage(@PathParam("userId") String userId, String message, Session session) {
//        logger.info("收到信息");
//    }


    /**
     * 消息发送（ 遍历用户Id , 在通过sendMsg方法发送消息）
     *
     * @param chatMessageDTO：消息内容
     * 订阅方式：/chatRoom/{uid}
     *
     */
    public void send(ChatMessageDTO chatMessageDTO) {

//        ChatMessageDTO chatMessageDTO = new ChatMessageDTO();
        ChatUserExample example = new ChatUserExample();
        example.createCriteria().andChatidEqualTo(chatMessageDTO.getTargetChatId());
        List<ChatUser> result = chatUserMapper.selectByExample(example);
        for(ChatUser chatUser: result){
            if(chatUser.getUserid() != null){
                simpMessagingTemplate.convertAndSend("/topic/"+String.valueOf(chatUser.getUserid()),chatMessageDTO);
            }
        }
    }

    public void sendTest(ChatMessageDTO chatMessageDTO) {
        simpMessagingTemplate.convertAndSend("/topic/"+String.valueOf(chatMessageDTO.getSenderUid()),chatMessageDTO);
    }


//    /**
//     * 消息发送(最后发送, 在send方法中循环用户Id 列表依次发送消息给指定人)
//     * <p>
//     * // 消息发送（同步:getBasicRemote 异步:getAsyncRemote）
//     * </P>
//     *
//     * @param userId  消息接收人ID , onlineUsers 的 key
//     * @param sendMsg 消息内容
//     */
//    private void sendMsg(String userId, SendMsgVO sendMsg) {
//        // 判断用户是否在线, 在线发送消息推送
//        if (clients.containsKey(userId)) {
//            clients.get(userId).getSession().getAsyncRemote().sendText(JSON.toJSONString(sendMsg));
//        }
//    }

//    /**
//     * 获取当前在线列表
//     * <p>
//     * 获取当前在线列表, 把onlineUsers 转到 OnlineUsersVO返回
//     * </p>
//     *
//     * @return
//     */
//    public synchronized List<ChatUserDTO> getOnlineUsers() {
//        List<ChatUserDTO> onlineUsersVOList = new ArrayList<>();
//        for (OnlineUser onlineUsers : clients.values()) {
//            ChatUserDTO chatUserDTO = new ChatUserDTO(); // onlineUsers 转化
//            onlineUsersVOList.add(chatUserDTO);
//        }
//        return onlineUsersVOList;
//    }


    //================================================================================
    //================================================================================
    //=======================  service方法(http接口调用操作) ============================
    //================================================================================
    //================================================================================

    public RoomVO createRoom(String uid, Room room1){
        //创建房间

        Room room = new Room();
        BeanUtils.copyProperties(room1,room);
        roomMapper.insert(room);
        int rid = room.getRoomid();
                //创建人员等级
        RoomUser roomUser = new RoomUser();
        roomUser.setRoomid(rid);
        roomUser.setState(0);
        roomUser.setUserid(Integer.valueOf(uid));
        roomUser.setLevel(RoomRoleEnum.HOST.getCode());
        roomUserMapper.insert(roomUser);
        //创建聊天窗口
        ChatGroup chatGroup = new ChatGroup();
        chatGroup.setFileurl(null);//// TODO: 2021/5/31
        chatGroup.setRoomid(rid);
        chatGroup.setState(0);
        chatGroup.setType(0);
        chatGroup.setTitle("公共频道");
        chatGroupMapper.insert(chatGroup);
        int chatId = chatGroup.getChatid();
        //加入聊天组
        ChatUser chatUser = new ChatUser();
        chatUser.setState(0);
        chatUser.setChatid(chatId);
        chatUser.setUserid(Integer.valueOf(uid));
        chatUserMapper.insert(chatUser);
        RoomVO roomVO = new RoomVO(rid,chatId);
        return roomVO;
    }

    public String deleteRoom(String uid,Integer rid){
        //删除房间
        RoomExample example = new RoomExample();
        example.createCriteria().andRoomidEqualTo(rid);
        roomMapper.deleteByExample(example);
        //删除人员等级
        RoomUserExample roomUserExample = new RoomUserExample();
        roomUserExample.createCriteria().andRoomidEqualTo(rid);
        roomUserMapper.deleteByExample(roomUserExample);
        //删除聊天窗口
        ChatGroupExample chatGroupExample = new ChatGroupExample();
        chatGroupExample.createCriteria().andRoomidEqualTo(rid);
        List<com.trpg.version1.mybatis.entity.ChatGroup> result = chatGroupMapper.selectByExample(chatGroupExample);
        chatGroupMapper.deleteByExample(chatGroupExample);
        //删除聊天组
        ChatUserExample chatUserExample = new ChatUserExample();
        List<Integer> chatIdList = result.stream().map(com.trpg.version1.mybatis.entity.ChatGroup::getChatid).collect(Collectors.toList());
        chatUserExample.createCriteria().andChatidIn(chatIdList);
        chatUserMapper.deleteByExample(chatUserExample);
        return "删除成功";
    }

    public Integer createChatGroup(ChatGroupDTO chatGroupDTO, Integer uid){
        if(!chatGroupDTO.getUid().contains(uid)){
            throw new OpException(ResultCode.INVALID_ATTRIBUTE.getCode(),ResultCode.INVALID_ATTRIBUTE.getDesc());
        }
        //权限校验
        RoomUserExample roomUserExample = new RoomUserExample();
        roomUserExample.createCriteria().andRoomidEqualTo(chatGroupDTO.getRid()).andUseridEqualTo(uid);
        List<RoomUser> result = roomUserMapper.selectByExample(roomUserExample);
        RoomUser roomUser = result.stream().findFirst().orElse(null);
        if(roomUser==null||!RoomRoleEnum.PLAYER.checkLevel(roomUser.getLevel())){
            throw new OpException(ResultCode.INVALID_ROOM_ROLE.getCode(),ResultCode.INVALID_ROOM_ROLE.getDesc());
        }
        //创建聊天窗口
        ChatGroup chatGroup = new ChatGroup();
        chatGroup.setFileurl(null);//// TODO: 2021/5/31
        chatGroup.setRoomid(chatGroupDTO.getRid());
        chatGroup.setState(0);
        chatGroup.setType(1);
        chatGroup.setTitle("公共频道");
        chatGroupMapper.insert(chatGroup);
        int chatId = chatGroup.getChatid();
        //加入聊天组
        ChatUser chatUser = new ChatUser();
        chatUser.setState(0);
        chatUser.setChatid(chatId);
        for(Integer selectedUid : chatGroupDTO.getUid()){
            chatUser.setUserid(selectedUid);
            chatUserMapper.insert(chatUser);
        }
        return chatId;
    }

    public Integer enterRoom(Integer uid,Integer rid){
        //参数校验
        RoomExample roomExample = new RoomExample();
        roomExample.createCriteria().andRoomidEqualTo(rid);
        List<Room> roomList = roomMapper.selectByExample(roomExample);
        if(roomList.size()==0){
            throw new OpException(ResultCode.INVALID_ATTRIBUTE.getCode(),ResultCode.INVALID_ATTRIBUTE.getDesc());
        }
        //查找聊天窗口
        ChatGroupExample chatGroupExample = new ChatGroupExample();
        chatGroupExample.createCriteria().andRoomidEqualTo(rid);
        List<ChatGroup> result = chatGroupMapper.selectByExample(chatGroupExample);
        ChatGroup chatGroup = result.stream().filter(e-> e.getType()==0).findFirst().orElse(null);
        if(chatGroup==null){
            throw new OpException(ResultCode.INVALID_ATTRIBUTE.getCode(),ResultCode.INVALID_ATTRIBUTE.getDesc());
        }
        int chatId = chatGroup.getChatid();
        //检查是否已在房间中
        RoomUserExample roomUserExample = new RoomUserExample();
        roomUserExample.createCriteria().andRoomidEqualTo(rid).andUseridEqualTo(uid);
        List<RoomUser> roomUserList = roomUserMapper.selectByExample(roomUserExample);
        RoomUser checkEntity = roomUserList.stream().findFirst().orElse(null);
        if(checkEntity!=null){
            return chatId;
        }
        //加入聊天组
        ChatUser chatUser = new ChatUser();
        chatUser.setState(0);
        chatUser.setChatid(chatId);
        chatUser.setUserid(uid);
        chatUserMapper.insert(chatUser);
        //创建人员等级
        RoomUser roomUser = new RoomUser();
        roomUser.setRoomid(rid);
        roomUser.setState(0);
        roomUser.setUserid(Integer.valueOf(uid));
        roomUser.setLevel(RoomRoleEnum.VIEWER.getCode());
        roomUserMapper.insert(roomUser);
        return chatId;
    }

    @Override
    public List<SysUser> getChatPeople(Integer chatId) {
        ChatUserExample chatUserExample = new ChatUserExample();
        chatUserExample.createCriteria().andChatidEqualTo(chatId);
        List<ChatUser> entity = chatUserMapper.selectByExample(chatUserExample);
        List<Integer> userId = new ArrayList<>();
        entity.stream().forEach(e->userId.add(e.getUserid()));
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andUseridIn(userId);
        List<SysUser> result = sysUserMapper.selectByExample(sysUserExample);
        return result;
    }

    @Override
    public List<ChatGroup> getChatGroupList(List<Integer> chatGroupId) {
        if(chatGroupId == null || chatGroupId.size() == 0){
            throw new OpException(ResultCode.INVALID_INPUT.getCode(),ResultCode.INVALID_INPUT.getDesc());
        }
        ChatGroupExample example = new ChatGroupExample();
        example.createCriteria().andChatidIn(chatGroupId);
        List<ChatGroup> result = chatGroupMapper.selectByExample(example);
        return result;
    }

    @Override
    public Integer getUserRoomRole(Integer uid, Integer rid) {
        RoomUserExample example = new RoomUserExample();
        example.createCriteria().andRoomidEqualTo(rid).andUseridEqualTo(uid);
        List<RoomUser> entity = roomUserMapper.selectByExample(example);
        RoomUser role = entity.stream().findFirst().orElse(null);
        if(role == null){
            throw new OpException(ResultCode.USER_NOT_IN_ROOM.getCode(),ResultCode.USER_NOT_IN_ROOM.getDesc());
        }
        return  role.getLevel();
    }

    @Override
    public RoomUserLevelVO getUserRoomAllInfo(Integer uid, Integer rid) {
        List<RoomUserLevelVO> entity = userRoomCharacterMapper.getUserRole(rid,uid);
        RoomUserLevelVO result = entity.stream().findFirst().orElse(null);
        if(result == null){
            throw new OpException(ResultCode.USER_NOT_IN_ROOM.getCode(),ResultCode.USER_NOT_IN_ROOM.getDesc());
        }
        if(result.getCharacterName() == null){
            result.setCid(-1);
            result.setCharacterName("");
        }
        return result;
    }

    @Override
    public List<RoomUserLevelVO> getAllUserRoomRole(Integer uid, Integer rid) {
        if(!RoomRoleEnum.HOST.checkLevel(getUserRoomRole(uid,rid))){
            throw new OpException(ResultCode.INVALID_ROOM_ROLE.getCode(),ResultCode.INVALID_ROOM_ROLE.getDesc());
        }
        List<RoomUserLevelVO> result = userRoomCharacterMapper.getUserRoleByRid(rid);
        result.stream().forEach(e->{
            if(e.getCharacterName() == null){
                e.setCharacterName("");
                e.setCid(-1);
            }
        });
        return result;
    }

    @Override
    public String setUserRoomRole(UserRoomRoleDTO userRoomRoleDTO, Integer uid) {
        if(!RoomRoleEnum.HOST.checkLevel(getUserRoomRole(uid,userRoomRoleDTO.getRid()))){
            throw new OpException(ResultCode.INVALID_ROOM_ROLE.getCode(),ResultCode.INVALID_ROOM_ROLE.getDesc());
        }
        if(userRoomRoleDTO.getUid() == uid){
            throw new OpException(ResultCode.USER_SELF_OP.getCode(),ResultCode.USER_SELF_OP.getDesc());
        }
        RoomUser roomUser = new RoomUser();
        roomUser.setLevel(userRoomRoleDTO.getLevel());
        roomUser.setUserid(userRoomRoleDTO.getUid());
        roomUser.setRoomid(userRoomRoleDTO.getRid());
        roomUser.setState(0);
        RoomUserExample example = new RoomUserExample();
        example.createCriteria().andUseridEqualTo(userRoomRoleDTO.getUid()).andRoomidEqualTo(userRoomRoleDTO.getRid());
        roomUserMapper.updateByExample(roomUser,example);
        return "修改成功";
    }

    @Override
    public String setUserRoomCharacter(UserRoomCharacterDTO characterDTO, Integer uid) {
        if(!RoomRoleEnum.HOST.checkLevel(getUserRoomRole(uid,characterDTO.getRid()))){
            throw new OpException(ResultCode.INVALID_ROOM_ROLE.getCode(),ResultCode.INVALID_ROOM_ROLE.getDesc());
        }
        if(!RoomRoleEnum.HOST.checkLevel(getUserRoomRole(characterDTO.getUid(),characterDTO.getRid()))){
            throw new OpException(ResultCode.INVALID_ROOM_ROLE.getCode(),ResultCode.INVALID_ROOM_ROLE.getDesc());
        }
        CharactExample example = new CharactExample();
        example.createCriteria().andCharacteridEqualTo(characterDTO.getCid()).andUseridEqualTo(characterDTO.getUid());
        long count = charactMapper.countByExample(example);
        if(count ==0){
            throw new OpException(ResultCode.CHARACTER_NOT_BELONG.getCode(),ResultCode.CHARACTER_NOT_BELONG.getDesc());
        }
//        CharacterR
        CharacterRoom entity = new CharacterRoom();
        entity.setRoomid(characterDTO.getRid());
        entity.setCharacterid(characterDTO.getCid());
        entity.setUserid(characterDTO.getUid());
        entity.setState(0);
        CharacterRoomExample example1 = new CharacterRoomExample();
        example1.createCriteria().andUseridEqualTo(characterDTO.getUid()).andRoomidEqualTo(characterDTO.getRid());
        if(characterRoomMapper.countByExample(example1) == 0){
            characterRoomMapper.insert(entity);
        }
        else{
            characterRoomMapper.updateByExample(entity,example1);
        }
        return "修改成功";
    }

    @Override
    public String changeCharacterAbility(CharacterStatusDTO characterStatusDTO, Integer uid, Integer rid) {
        CharactExample example = new CharactExample();
        example.createCriteria().andUseridEqualTo(uid).andCharacteridEqualTo(characterStatusDTO.getCid());
        long count = charactMapper.countByExample(example);
        if(!RoomRoleEnum.HOST.checkLevel(getUserRoomRole(uid, rid)) && count == 0){
            throw new OpException(ResultCode.INVALID_ROOM_ROLE.getCode(),ResultCode.INVALID_ROOM_ROLE.getDesc());
        }
        Ability entity = new Ability();
        entity.setNumlearn(characterStatusDTO.getNum());
        AbilityExample abilityExample = new AbilityExample();
        abilityExample.createCriteria().andCharacteridEqualTo(characterStatusDTO.getCid()).andSkillidEqualTo(characterStatusDTO.getAid());
        if(abilityMapper.countByExample(abilityExample) == 0){
            abilityMapper.insert(entity);
        }
        else{
            abilityMapper.updateByExample(entity,abilityExample);
        }
        return "修改成功";
    }

    @Override
    public String changeCharacterAttribute(CharacterStatusDTO characterStatusDTO, Integer uid, Integer rid) {
        CharactExample example = new CharactExample();
        example.createCriteria().andUseridEqualTo(uid).andCharacteridEqualTo(characterStatusDTO.getCid());
        long count = charactMapper.countByExample(example);
        if(!RoomRoleEnum.HOST.checkLevel(getUserRoomRole(uid, rid)) && count == 0){
            throw new OpException(ResultCode.INVALID_ROOM_ROLE.getCode(),ResultCode.INVALID_ROOM_ROLE.getDesc());
        }
        AttributeCharacter entity = new AttributeCharacter();
        entity.setNum(characterStatusDTO.getNum());
        AttributeCharacterExample attributeCharacterExample = new AttributeCharacterExample();
        attributeCharacterExample.createCriteria().andCharacteridEqualTo(characterStatusDTO.getCid()).andAttributeidEqualTo(characterStatusDTO.getAid());
        attributeCharacterMapper.updateByExample(entity,attributeCharacterExample);
        return "修改成功";
    }

    @Override
    public Integer createBoard(InfoBoardDTO infoBoardDTO, Integer uid, Integer rid) {
        if(RoomRoleEnum.PLAYER.checkLevel(getUserRoomRole(uid,rid))){
            throw new OpException(ResultCode.INVALID_ROOM_ROLE.getCode(),ResultCode.INVALID_ROOM_ROLE.getDesc());
        }
        InfoBoard infoBoard = new InfoBoard();
        infoBoard.setRoomid(uid);
        infoBoard.setInfo(infoBoard.getInfo());
        infoBoard.setTitle(infoBoard.getTitle());
        infoBoard.setState(0);
        return infoBoardMapper.insert(infoBoard);
    }

    //    public String leaveRoom(String uid, String rid){
//        //参数校验
//        RoomExample roomExample = new RoomExample();
//        roomExample.createCriteria().andRoomidEqualTo(rid);
//        List<Room> roomList = roomMapper.selectByExample(roomExample);
//        if(roomList.size()==0){
//            throw new OpException(ResultCode.INVALID_ATTRIBUTE.getCode(),ResultCode.INVALID_ATTRIBUTE.getDesc());
//        }
//        //查找聊天窗口
//        ChatGroupExample chatGroupExample = new ChatGroupExample();
//        chatGroupExample.createCriteria().andRoomidEqualTo(rid).andTypeEqualTo(1);
//        List<ChatGroup> result = chatGroupMapper.selectByExample(chatGroupExample);
//        ChatGroup chatGroup = result.stream().findFirst().orElse(null);
//        if(chatGroup==null){
//            throw new OpException(ResultCode.INVALID_ATTRIBUTE.getCode(),ResultCode.INVALID_ATTRIBUTE.getDesc());
//        }
//        int chatId = chatGroup.getChatid();
//        //加入聊天组
//        ChatUser chatUser = new ChatUser();
//        chatUser.setState(0);
//        chatUser.setChatid(chatId);
//        chatUser.setUserid(uid);
//        chatUserMapper.insert(chatUser);
//        return chatId;
//    }



    /**
     * 获取当前在线人数
     *
     * @return
     */
    public Integer getOnlineCount() {
//        return onlineNumber.get();
        return 0;
    }


    /**
     * 获取当前在线用户信息
     *
     * @return
     */
    public List<Integer> getOnlineUsersList(Integer rid) {
        RoomUserExample example = new RoomUserExample();
        example.createCriteria().andRoomidEqualTo(rid);
        List<RoomUser> roomUsers = roomUserMapper.selectByExample(example);
        List<Integer> result = roomUsers.stream().map(RoomUser::getUserid).collect(Collectors.toList());
        return result;
    }

//    /**
//     * 发送消息 (单向通知发送，不可回复)
//     *
//     * @param form     发送人id
//     * @param username 发送人用户名
//     * @param to       接收人id（多个逗号分隔）
//     * @param content  发送内容
//     * @param content  发送内容
//     * @param content  扩暂发送内容
//     * @return
//     */
//    public List<ChatUserDTO> send(String form, String username, String to, String content, String extras) {
//        // 发送消息
//        this.send(new SendMsgVO(4, form, username, to, content, extras));
//        return getOnlineUsers();
//    }
}
