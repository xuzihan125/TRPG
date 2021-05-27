package com.trpg.version1.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.service.ValidService;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021.5.27
 **/
@Service
public class ValidServiceImpl implements ValidService {
    //这个不用改
    private String apiUrl = "https://sms_developer.zhenzikj.com";
    //榛子云系统上获取
    private String appId = "109149";
    private String appSecret = "7b586ecd-b860-4aec-ad78-1d8ca8e2ce4f";

    @Override
    public String getPhoneCode(String phoneNumber) {
        String code = String.valueOf(new Random().nextInt(999999));
        ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
        String result;
        try{
            result = client.send(phoneNumber, "您的验证码为:" + code + "，该码有效期为5分钟，该码只能使用一次!");
        }catch(Exception e){
            throw new OpException(ResultCode.INVALID_PHONE_CLIENT.getCode(),ResultCode.INVALID_PHONE_CLIENT.getDesc());
        }
        JSONObject jsonObject = JSONObject.parseObject(result);
        if(jsonObject.getIntValue("code")!=0){
            throw new OpException(ResultCode.INVALID_PHONE_TARGET.getCode(),ResultCode.INVALID_PHONE_TARGET.getDesc());
        }
        return code;
    }

    @Override
    public String getEmailCode(String type) {
        return null;
    }
}
