package com.trpg.version1.common.exception;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.JsonMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintDeclarationException;

/**
 * @author xuzihan
 * @version 1.0
 * @description: 异常处理
 * @data 2021/3/30
 **/
@RestControllerAdvice
public class ExceptionHandle {
    Logger logger = LoggerFactory.getLogger(com.trpg.version1.common.exception.ExceptionHandle.class);

    @ExceptionHandler(value = ConstraintDeclarationException.class)
    public Object handleConstraintDeclarationException(Exception e, HttpServletRequest req){
        logger.error(e.getMessage());
        e.printStackTrace();
        return new JsonMessage<String>(e.getMessage(),ResultCode.INVALID_ATTRIBUTE.getCode(),ResultCode.INVALID_ATTRIBUTE.getDesc());
    }

    @ExceptionHandler(value = {OpException.class})
    public Object handleException(OpException e, HttpServletRequest req) {
        logger.error(e.getMessage());
        e.printStackTrace();
        return new JsonMessage<String>("系统错误",e.getErrorCode(),e.getMessage());
    }

}
