package com.trpg.version1.controller.auth;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.mybatis.dto.LoginDTO;
import com.trpg.version1.mybatis.dto.UserDTO;
import com.trpg.version1.mybatis.dto.UserModifyDTO;
import com.trpg.version1.mybatis.vo.LoginVO;
import com.trpg.version1.mybatis.vo.UserInfoVO;
import com.trpg.version1.mybatis.vo.UserModifyVO;
import com.trpg.version1.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

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
            //EMPTY_EMAIL("010003", "邮箱不能为空")
            //WRONGFORMAT_EMAIL("010006", "邮箱格式错误")
            //EMPTY_PASSWORD("010004", "密码不能为空"),
            //EMPTY_REPASSWORD("010005", "确认密码不能为空")
            //WRONGFORMAT_PASSWORD("010007", "密码长度需要在6到16位之间")
            //EMPTY_PHONE("010009", "电话号码为空"),
            //WRONGFORMAT_PHONE("010010", "电话号码格式错误")
            //EMPTY_NICKNAME("010011", "昵称不能为空"),
            //WRONGFORMAT_NICKNAME("010012", "昵称长度必须在6到32之间"),
            List<FieldError> fieldErrors = userCheckResult.getFieldErrors();
            switch (fieldErrors.get(0).getDefaultMessage()) {
                case "010003":
                    throw new OpException(ResultCode.EMPTY_EMAIL.getCode(),ResultCode.EMPTY_EMAIL.getDesc());
                case "010006":
                    throw new OpException(ResultCode.WRONGFORMAT_EMAIL.getCode(),ResultCode.WRONGFORMAT_EMAIL.getDesc());
                case "010004":
                    throw new OpException(ResultCode.EMPTY_PASSWORD.getCode(),ResultCode.EMPTY_PASSWORD.getDesc());
                case "010005":
                    throw new OpException(ResultCode.EMPTY_REPASSWORD.getCode(),ResultCode.EMPTY_REPASSWORD.getDesc());
                case "010007":
                    throw new OpException(ResultCode.WRONGFORMAT_PASSWORD.getCode(),ResultCode.WRONGFORMAT_PASSWORD.getDesc());
                case "010009":
                    throw new OpException(ResultCode.EMPTY_PHONE.getCode(),ResultCode.EMPTY_PHONE.getDesc());
                case "010010":
                    throw new OpException(ResultCode.WRONGFORMAT_PHONE.getCode(),ResultCode.WRONGFORMAT_PHONE.getDesc());
                case "010011":
                    throw new OpException(ResultCode.EMPTY_NICKNAME.getCode(),ResultCode.EMPTY_NICKNAME.getDesc());
                case "010012":
                    throw new OpException(ResultCode.WRONGFORMAT_NICKNAME.getCode(),ResultCode.WRONGFORMAT_NICKNAME.getDesc());
            }
//            throw new OpException(ResultCode.INVALID_INPUT.getCode(),ResultCode.INVALID_INPUT.getDesc());
        }
        return new JsonMessage<String>(userService.createUser(userDTO));
    }

    @ApiOperation(value = "方法描述:用户登录,请求方式:GET,参数:LoginDTO,返回值:JsonMessage<LoginVO>,是否可用:ok")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public JsonMessage<LoginVO> login(@Valid LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            switch (fieldErrors.get(0).getDefaultMessage()) {
                case "010003":
                    throw new OpException(ResultCode.EMPTY_EMAIL.getCode(),ResultCode.EMPTY_EMAIL.getDesc());
                case "010006":
                    throw new OpException(ResultCode.WRONGFORMAT_EMAIL.getCode(),ResultCode.WRONGFORMAT_EMAIL.getDesc());
                case "010004":
                    throw new OpException(ResultCode.EMPTY_PASSWORD.getCode(),ResultCode.EMPTY_PASSWORD.getDesc());
            }
//            throw new OpException(ResultCode.INVALID_INPUT.getCode(),ResultCode.INVALID_INPUT.getDesc());
        }
        return new JsonMessage<LoginVO>(userService.login(loginDTO));
    }

    @ApiOperation(value = "方法描述:用户信息修改,请求方式:GET,参数:UserModifyDTO,返回值:JsonMessage<UserModifyVO>,是否可用:ok")
    @RequestMapping(value = "/userModify", method = RequestMethod.GET)
    public JsonMessage<UserModifyVO> UserModifyService(@Valid UserModifyDTO userModifyDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            //EMPTY_EMAIL("010003", "邮箱不能为空")
            //WRONGFORMAT_EMAIL("010006", "邮箱格式错误")
            //EMPTY_PHONE("010009", "电话号码为空"),
            //WRONGFORMAT_PHONE("010010", "电话号码格式错误")
            //EMPTY_NICKNAME("010011", "昵称不能为空"),
            //WRONGFORMAT_NICKNAME("010012", "昵称长度必须在6到32之间"),
            //EMPTY_WECHATID("010013", "微信号不能为空"),
            //EMPTY_DESCRI("010014", "描述不能为空"),
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            switch (fieldErrors.get(0).getDefaultMessage()) {
                case "010003":
                    throw new OpException(ResultCode.EMPTY_EMAIL.getCode(), ResultCode.EMPTY_EMAIL.getDesc());
                case "010006":
                    throw new OpException(ResultCode.WRONGFORMAT_EMAIL.getCode(), ResultCode.WRONGFORMAT_EMAIL.getDesc());
                case "010009":
                    throw new OpException(ResultCode.EMPTY_PHONE.getCode(), ResultCode.EMPTY_PHONE.getDesc());
                case "010010":
                    throw new OpException(ResultCode.WRONGFORMAT_PHONE.getCode(), ResultCode.WRONGFORMAT_PHONE.getDesc());
                case "010011":
                    throw new OpException(ResultCode.EMPTY_NICKNAME.getCode(), ResultCode.EMPTY_NICKNAME.getDesc());
                case "010012":
                    throw new OpException(ResultCode.WRONGFORMAT_NICKNAME.getCode(), ResultCode.WRONGFORMAT_NICKNAME.getDesc());
                case "010013":
                    throw new OpException(ResultCode.EMPTY_WECHATID.getCode(), ResultCode.EMPTY_WECHATID.getDesc());
                case "010014":
                    throw new OpException(ResultCode.EMPTY_DESCRI.getCode(), ResultCode.EMPTY_DESCRI.getDesc());
            }
        }
        return new JsonMessage<UserModifyVO>(userService.UserModify(userModifyDTO));
    }

    @ApiOperation(value = "方法描述:用户信息获取,请求方式:GET,参数:userid,返回值:JsonMessage<UserInfoVO>,是否可用:ok")
    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public JsonMessage<UserInfoVO> UserInfo(Integer userid){
        return new JsonMessage<UserInfoVO>(userService.userInfo(userid));
    }
}
