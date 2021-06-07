package com.trpg.version1.common.security.stomp;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.common.security.JWT.JWTUtil;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;
import sun.security.acl.PrincipalImpl;

import javax.annotation.Resource;
import java.security.Principal;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/7
 **/
public class UserInterceptor implements ChannelInterceptor {
    @Resource
    private JWTUtil jwtUtil;

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        StompHeaderAccessor accessor = MessageHeaderAccessor.getAccessor(message, StompHeaderAccessor.class);
        if (StompCommand.CONNECT.equals(accessor.getCommand())) {
            Object raw = message.getHeaders().get(SimpMessageHeaderAccessor.NATIVE_HEADERS);
            if (raw instanceof Map) {
                //这里就是token
                Object name = ((Map) raw).get("Authorization");
                if (name instanceof LinkedList) {
                    // 设置当前访问器的认证用户
                    String token = ((LinkedList) name).get(0).toString();
                    if(token == null){
                        throw new OpException(ResultCode.TOKENERROR.getCode(),ResultCode.TOKENERROR.getDesc());
                    }
                    if (StringUtils.hasText(token) && token.startsWith("Bearer ")) {
                        token =  token.substring(7, token.length());
                    }
                    UserDetails user = jwtUtil.getUserDetails(token);
                    Principal principal = new PrincipalImpl(user.getUsername());
                    accessor.setUser(principal);

                }
            }
        }

        return message;
    }
}
