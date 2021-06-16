package com.trpg.version1.service.Impl;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.common.util.Calculator;
import com.trpg.version1.common.util.DiceUtil;
import com.trpg.version1.common.util.StringUtil;
import com.trpg.version1.mybatis.dao.AbilityMapper;
import com.trpg.version1.mybatis.dao.AttributeCharacterMapper;
import com.trpg.version1.mybatis.dao.AttributeMapper;
import com.trpg.version1.mybatis.dao.SkillMapper;
import com.trpg.version1.mybatis.entity.*;
import com.trpg.version1.service.OperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/14
 **/
@Service
@Slf4j
public class OperationServiceImpl implements OperationService {

    @Value("${operation.rollDice}\\s(.*)")
    private String rollDice;

    @Value("${operation.fileRel}\\s(.*)")
    private String checkSkill;

    @Resource
    private SkillMapper skillMapper;

    @Resource
    private AbilityMapper abilityMapper;

    @Resource
    private AttributeMapper attributeMapper;

    @Resource
    private AttributeCharacterMapper attributeCharacterMapper;


    @Override
    public String checkOp(String content, Integer cid) {
        String result = content;
        if(Pattern.matches(rollDice,content)){
            Pattern r = Pattern.compile(rollDice);
            Matcher m = r.matcher(content);
            if(m.find()){
                try{
                    String calcu_line = rollDice(m.group(1));
                    result = content + " = " + calcu_line;
                    result += " = "+ (int)Calculator.conversion(calcu_line);
                }catch (Exception e){
                    return content;
                }
            }
        }
        else if(Pattern.matches(checkSkill,content)){
            Pattern r = Pattern.compile(checkSkill);
            Matcher m = r.matcher(content);
            if(m.find()){
                try{
                    result = checkSkill(m.group(1),cid);
                }catch (Exception e){
                    return content;
                }
            }
        }
        return result;
    }

    public String rollDice(String content) throws Exception{
        String dice = "([\\d\\s]+)[dD]([\\d\\s]+)";
        Pattern r = Pattern.compile(dice);
        Matcher m = r.matcher(content);
        while(m.find()){
            String num1 = m.group(1).replaceAll(" ", "");
            String num2 = m.group(2).replaceAll(" ", "");
            content = m.replaceFirst(DiceUtil.rolldice(Integer.valueOf(num1),Integer.valueOf(num2)));
            m = r.matcher(content);
        }
        return content;
    }

    public String checkSkill(String content, Integer cid) throws Exception{
        content = content.replaceAll(" ","");
        SkillExample skillExample = new SkillExample();
        skillExample.createCriteria().andNameEqualTo(content).andCidIn(Arrays.asList(cid,0));
        List<Skill> skillList = skillMapper.selectByExample(skillExample);
        Skill skill = skillList.stream().findFirst().orElse(null);
        if(skill != null){
            int limit = skill.getNumdefault();
            AbilityExample abilityExample = new AbilityExample();
            abilityExample.createCriteria().andSkillidEqualTo(skill.getSkillid()).andCharacteridEqualTo(cid);
            List<Ability> abilityList = abilityMapper.selectByExample(abilityExample);
            Ability ability = abilityList.stream().findFirst().orElse(null);
            if(ability != null){
                limit += ability.getNumhobby()+ability.getNumlearn()+ability.getNumpro();
            }
            content += DiceUtil.rollAbility(limit);
            return content;
        }
        AttributeExample attributeExample = new AttributeExample();
        attributeExample.createCriteria().andNameEqualTo(content);
        List<Attribute> attributeList = attributeMapper.selectByExample(attributeExample);
        Attribute attribute = attributeList.stream().findFirst().orElse(null);
        if(attribute != null){
            AttributeCharacterExample attributeCharacterExample = new AttributeCharacterExample();
            attributeCharacterExample.createCriteria().
                    andAttributeidEqualTo(attribute.getAttributeid()).
                    andCharacteridEqualTo(cid);
            List<AttributeCharacter> attributeCharacterList = attributeCharacterMapper.selectByExample(attributeCharacterExample);
            AttributeCharacter ability = attributeCharacterList.stream().findFirst().orElse(null);
            if(ability==null){
                content += " = " + "属性不存在";
                return content ;
            }
            content += " = " + DiceUtil.rollAbility(ability.getNum());
            return content;
        }
        content += " = " + "技能不存在";
        return content;
    }
}
