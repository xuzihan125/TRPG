package com.trpg.version1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/29
 **/
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    /**
     * @description: 注册一个websocket端点，连接到websocket服务器。withSockJS()是用来为不支持websocket的浏览器启用后备选项，使用了SockJS
     * @author xuzih
     * @date 2021/5/29 14:48
     * @version 1.0
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // 在网页上我们就可以通过这个链接 /ws ==<c:url value='/ws'></span> 来和服务器的WebSocket连接
        // 创建连接url
        registry.addEndpoint("/chatRoom").withSockJS();
    }

//    /**
//     * @description: /app路由到消息处理,/topic路由到消息代理
//     * @author xuzih
//     * @date 2021/5/29 14:50
//     * @version 1.0
//     */
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        // 应用程序以 /app 为前缀，而 代理目的地以 /topic 为前缀.
//        // js.url = "/send/hello" -> @MessageMapping("/hello") 注释的方法.
//        registry.enableSimpleBroker("/receive");//服务器可想客户端发送信息的域
//        registry.setApplicationDestinationPrefixes("/send");//客户端发送信息的目标
//    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // 应用程序以 /app 为前缀，而 代理目的地以 /topic 为前缀.
        // js.url = "/app/hello" -> @MessageMapping("/hello") 注释的方法.
        registry.enableSimpleBroker("/topic");               //设置服务器广播消息的基础路径
        registry.setApplicationDestinationPrefixes("/app");  //设置客户端订阅消息的基础路径
//        registry.setPathMatcher(new AntPathMatcher("."));    //可以已“.”来分割路径，看看类级别的@messageMapping和方法级别的@messageMapping
    }

}
