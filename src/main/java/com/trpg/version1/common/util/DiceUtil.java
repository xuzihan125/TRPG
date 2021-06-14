package com.trpg.version1.common.util;

import java.util.Random;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data
 **/
public class DiceUtil {
    public static String rolldice(int num1,int num2){
        Random random = new Random();
        String result = "";
        for(int i=0;i<num1;i++){
            result += random.nextInt(num2)+1;
            result += "+";
        }
        return "("+result.substring(0,result.length()-1)+")";
    }

    public static String rollAbility(int limit){
        Random random = new Random();
        String result = "";
        int roll = random.nextInt(100) +1;
        result += roll+"/"+limit;
        if(roll == 1){
            result += " " +"大成功";
        }
        else if(roll <= limit/5){
            result += " " +"极难成功";
        }
        else if(roll <= limit/2){
            result += " " +"困难成功";
        }
        else if(roll <= limit){
            result += " " +"普通成功";
        }
        else if(roll == 100){
            result += " " +"大失败";
        }
        else{
            result += " " +"失败";
        }
        return result;
    }
}
