package com.trpg.version1.common.exception;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/3/30
 **/
public class OpException extends RuntimeException{
    private String errorCode;

    public OpException(String msg){
        super(msg);
        errorCode = "";
    }

    public OpException(String errorCode,String msg){
        super(msg);
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return errorCode;
    }
}
