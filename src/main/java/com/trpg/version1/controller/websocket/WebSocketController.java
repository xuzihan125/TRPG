//package com.trpg.version1.controller.websocket;
//
//import com.trpg.version1.common.JsonMessage;
//import com.trpg.version1.mybatis.dto.ChatGroupDTO;
//import com.trpg.version1.mybatis.entity.Room;
//import com.trpg.version1.mybatis.vo.RoomVO;
//import com.trpg.version1.service.WebSocketService;
//import org.springframework.beans.factory.annotation.Value;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiImplicitParams;
//import io.swagger.annotations.ApiOperation;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.xml.transform.Result;
//import java.util.Map;
//
///**
// * @author xuzihan
// * @version 1.0
// * @description: TODO
// * @data 2021/5/30
// **/
//public class WebSocketController {
////    /**
////     * websocket ip 或域名
////     */
////    @Value("${websocket.ip}")
////    private String ip;
////
////    /**
////     * websocket 端口号
////     */
////    @Value("${websocket.port}")
////    private String port;
////
////    /**
////     * websocket接口
////     */
////    @Value("${websocket.interfaceName}")
////    private String interfaceName;
//
//    // websocket 逻辑代码
//    @Autowired
//    private WebSocketService websocketService;
//
//    @RequestMapping(value = "/createRoom", method = RequestMethod.POST)
//    public JsonMessage<RoomVO> createRoom(String uid, Room room){
//        return new JsonMessage<>(websocketService.createRoom(uid,room));
//    }
//
//    @RequestMapping(value = "/deleteRoom", method = RequestMethod.POST)
//    public JsonMessage<String> deleteRoom(String uid,Integer rid){
//        return new JsonMessage<>(websocketService.deleteRoom(uid,rid));
//    }
//
//    public JsonMessage<Integer> createChatGroup(ChatGroupDTO chatGroupDTO, Integer uid){
//        return new JsonMessage<>(websocketService.createChatGroup(chatGroupDTO,uid));
//    }
//
//    public JsonMessage<Integer> enterRoom(Integer uid, Integer rid){
//        return new JsonMessage<>(websocketService.enterRoom(uid,rid));
//    }
//
//
//
////    /**
////     * TODO 发送消息
////     */
////    @RequestMapping(value = "/send", method = RequestMethod.POST)
////    @ApiOperation("发送消息")
////    @ApiImplicitParams({
////            @ApiImplicitParam(name = "form", value = "发送人Id", required = true),
////            @ApiImplicitParam(name = "username", value = "发送人用户名", required = true),
////            @ApiImplicitParam(name = "to", value = "接收人Id, 全部为ALL", required = true),
////            @ApiImplicitParam(name = "content", value = "发送内容", required = true),
////            @ApiImplicitParam(name = "extras", value = "附加发送内容", required = true)
////    })
////    public JsonMessage<String> send(String form, String username, String to, String content, String extras) {
////        websocketService.send(form, username, to, content, extras);
////        return Result.success();
////    }
////
////    /**
////     * TODO 获取当前在线人数
////     */
////    @RequestMapping(value = "/getOnlineCount", method = RequestMethod.GET)
////    @ApiOperation("发送消息")
////    public JsonMessage<Integer> getOnlineCount() {
////        Integer onlineCount = websocketService.getOnlineCount();
////        return new JsonMessage(onlineCount);
////    }
////
////
////    @RequestMapping(value = "/getOnlineUsersList", method = RequestMethod.GET)
////    @ApiOperation("获取当前在线用户列表")
////    public JsonMessage<List<OnlineUserVO>> getOnlineUsersList() {
////        return new JsonMessage(websocketService.getOnlineUsersList());
////    }
//
////    /**
////     * TODO 获取webSocket  连接地址,  // 实际情况根据用户 token获取用户信息返回
////     * 获取socket地址
////     * 获取用户名
////     * 获取用户Id
////     */
////    @RequestMapping(value = "/getPath", method = RequestMethod.GET)
////    @ApiOperation("游客登录获取websocket连接地址")
////    public Result<Map<String, String>> getPath() {
////        // 配置检查
////        if (StringUtils.isBlank(ip) || StringUtils.isBlank(port) || StringUtils.isBlank(interfaceName)) {
////            throw new ErrorException(ResultEnum.SYS_SOCKET_CONFIG_ERROR);
////        }
////        // 随机用户名
////        String username = "游客:" + new SimpleDateFormat("ssSSS").format(new Date());
////        // 随机用户id
////        String userId = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
////
////        // 连接地址， // "ws://192.168.0.154:9049/websocket/1/张三"
////        String path = "ws://" + ip + ":" + port + interfaceName + "/" + userId + "/" + username;
////
////        //返回参数
////        Map<String, String> map = new HashMap<>();
////        map.put("path", path);
////        map.put("userId", userId);
////        map.put("username", username);
////        return Result.success(map);
////    }
//
//
//
//
//
//}
