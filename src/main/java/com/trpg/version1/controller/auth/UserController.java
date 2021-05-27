package com.trpg.version1.controller.auth;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.mybatis.dto.LoginDTO;
import com.trpg.version1.mybatis.dto.UserDTO;
import com.trpg.version1.mybatis.vo.LoginVO;
import com.trpg.version1.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/23
 **/
@Api(value = "用户注册和登录")
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "方法描述:用户注册,请求方式:POST,参数:UserDTO,返回值:JsonMessage<String>,是否可用:ok")
    @RequestMapping(value = "/auth/register",method = RequestMethod.POST)
    public JsonMessage<String> createUserService(@Valid UserDTO userDTO, BindingResult userCheckResult){
        if(userCheckResult.hasErrors()){
            throw new OpException(ResultCode.INVALID_INPUT.getCode(),ResultCode.INVALID_INPUT.getDesc());
        }
        return new JsonMessage<String>(userService.createUser(userDTO));
    }

    @ApiOperation(value = "方法描述:用户登录,请求方式:GET,参数:LoginDTO,返回值:JsonMessage<LoginVO>,是否可用:ok")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public JsonMessage<LoginVO> login(@Valid LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new OpException(ResultCode.INVALID_INPUT.getCode(),ResultCode.INVALID_INPUT.getDesc());
        }
        return new JsonMessage<LoginVO>(userService.login(loginDTO));
    }
}
