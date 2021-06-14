package com.trpg.version1.service.Impl;

import com.trpg.version1.service.OperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/14
 **/
@Service
@Slf4j
public class OperationServiceImpl implements OperationService {

    @Value("${operation.rollDice}")
    private String rollDice;

    @Value("${operation.fileRel}")
    private String checkSkill;

    @Override
    public String checkOp(String content, Integer cid) {
        if(Pattern.matches(rollDice,content)){
            log.info("roleDice");
        }
        else if(Pattern.matches(checkSkill,content)){
            log.info("checkSkill");
        }
        return null;
    }
}
