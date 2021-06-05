package com.trpg.version1.common.constrain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/23
 **/
@Slf4j
public class PhoneValidator implements ConstraintValidator<PhoneValid,String> {
    @Value("${valid.phone.length}")
    private int PHONE_LENGTH;

    private static final Pattern pattern = Pattern.compile("^[1]\\d{10}$");

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext context) {
        if(phone == null ||phone.isEmpty()){
//            log.warn("PhoneValidator phone is empty, phone = {}", phone);
            return false;
        }

        if(phone.length() != PHONE_LENGTH){
//            log.warn("PhoneValidator phone length valid fail, phone = {}", phone);
            return false;
        }


        if(!pattern.matcher(phone).matches()){
//            log.warn("PhoneValidator phone pattern valid fail, phone = {}", phone);
            return false;
        }

        return true;
    }
}
