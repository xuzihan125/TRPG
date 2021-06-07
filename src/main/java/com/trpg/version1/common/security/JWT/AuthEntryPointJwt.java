package com.trpg.version1.common.security.JWT;

import com.alibaba.fastjson.JSON;
import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.JsonMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
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
public class AuthEntryPointJwt implements AuthenticationEntryPoint {

    private static Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);


    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        e.printStackTrace();
        httpServletResponse.getWriter()
                .write(JSON.toJSONString(
                        new JsonMessage<String>(e.getMessage(),
                                ResultCode.TOKENERROR.getCode(),
                                ResultCode.TOKENERROR.getDesc())));
    }
}
