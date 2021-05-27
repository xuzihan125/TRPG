package com.trpg.version1.common.util;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/5/23
 **/
public class StringUtil {
    /**
     * @description: 验证数据是否为空
     * @author xuzih
     * @date 2021/5/25 15:42
     * @version 1.0
     */
    public static boolean isEmpty(Object str) {
        return (str == null || "".equals(str));
    }
}
