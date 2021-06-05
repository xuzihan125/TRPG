package com.trpg.version1.common.util;

import com.trpg.version1.common.Enum.ResultCode;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/5
 **/
public class ResultCodeUtil {
    public static ResultCode getCodeFromBind(BindingResult result){
        if(!result.hasErrors()){
            return null;
        }
        List<FieldError> fieldErrors = result.getFieldErrors();
        String code = fieldErrors.get(0).getDefaultMessage();
        ResultCode resultCode = ResultCode.getError(code);
        return resultCode;
    }
}
