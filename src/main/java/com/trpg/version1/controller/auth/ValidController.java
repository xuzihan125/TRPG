package com.trpg.version1.controller.auth;

import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.common.constrain.PhoneValid;
import com.trpg.version1.service.ValidService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/26
 **/
@Api(value = "用户验证")
@Controller
public class ValidController {
    @Resource
    private ValidService validService;

    @ApiOperation(value = "方法描述:获得手机验证码,请求方式:GET,参数:String,返回值:JsonMessage<String>,是否可用:ok")
    @RequestMapping(value = "/auth/phoneCode", method = RequestMethod.GET)
    JsonMessage<String> getPhoneCode(@PhoneValid String phoneNumber){
        return new JsonMessage<String>(validService.getPhoneCode(phoneNumber));
    }

    @ApiOperation(value = "方法描述:获得邮箱验证码,请求方式:GET,参数:String,返回值:JsonMessage<String>,是否可用:no")
    @RequestMapping(value = "/auth/emailCode", method = RequestMethod.GET)
    JsonMessage<String> getEmailCode(@PhoneValid String phoneNumber){
        return new JsonMessage<String>(validService.getEmailCode(phoneNumber));
    }



}
