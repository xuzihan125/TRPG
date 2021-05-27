package com.trpg.version1.common;

import com.trpg.version1.common.Enum.ResultCode;
import lombok.Data;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/20
 **/
@Data
public class JsonMessage<T> {
    private String code;
    private String desc;
    private T content;

    public JsonMessage(T content){
        code = ResultCode.SUCCESS.getCode();
        desc = ResultCode.SUCCESS.getDesc();
        this.content = content;
    }

    public JsonMessage(T content, String code, String desc){
        this.code = code;
        this.desc = desc;
        this.content = content;
    }
}
