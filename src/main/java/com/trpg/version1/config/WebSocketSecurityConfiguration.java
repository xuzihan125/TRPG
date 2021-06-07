package com.trpg.version1.config;

import com.trpg.version1.common.Enum.RoleEnum;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.config.annotation.web.messaging.MessageSecurityMetadataSourceRegistry;
import org.springframework.security.config.annotation.web.socket.AbstractSecurityWebSocketMessageBrokerConfigurer;

///**
// * @author xuzihan
// * @version 1.0
// * @description: TODO
// * @data 2021/6/7
// **/
//public class WebSocketSecurityConfiguration extends AbstractSecurityWebSocketMessageBrokerConfigurer {
//    @Override
//    protected void configureInbound(MessageSecurityMetadataSourceRegistry messages) {
//        messages
//                .nullDestMatcher().authenticated()
//                .simpSubscribeDestMatchers("/app/**").hasRole(RoleEnum.DEFAULT_ROLE.getRole());
//    }
//}
