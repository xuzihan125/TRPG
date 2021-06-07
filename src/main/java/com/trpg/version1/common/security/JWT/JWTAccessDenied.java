package com.trpg.version1.common.security.JWT;

import com.alibaba.fastjson.JSON;
import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.JsonMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/20
 **/
@Component
public class JWTAccessDenied implements AccessDeniedHandler {
    private static Logger logger = LoggerFactory.getLogger(JWTAccessDenied.class);
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        logger.info(e.getMessage());
        httpServletResponse.getWriter()
                .write(JSON.toJSONString(
                        new JsonMessage<String>(e.getMessage(),
                                ResultCode.INVALID_AUTHOR.getCode(),
                                ResultCode.INVALID_AUTHOR.getDesc())));
    }
}
