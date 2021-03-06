package com.zh.spider.rankinfo.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author zhouhao
 * @version 1.0
 * @date 2020/2/5 14:58
 * @Description
 * 工具类
 */
public final class MathUtils {

    private MathUtils(){}

    /**
     *
     * @param numberStr
     * 数字串
     * 129.1万=129.1
     * @return
     */
    public static String getNumber(String numberStr){
        return numberStr.substring(0,numberStr.length()-1);
    }

    /**
     * 分割字符串
     * https://www.bilibili.com/ranking/all/129/0/1=[129,0,1]
     * @param numberStr
     * @return
     */
    @Deprecated
    public static String[] getTypeNumber(String numberStr){
        String[] splits = numberStr.substring(numberStr.indexOf("com") + 4).split("/");
        return Arrays.copyOfRange(splits,2,splits.length);
    }

    /**
     * 获取视频分类
     * @param numberStr
     * @return
     */
    public static String getType(String numberStr){
        if(StringUtils.isBlank(numberStr)){
            return StringUtils.EMPTY;
        }
        int index = numberStr.lastIndexOf("/");
        if(index > -1){
            numberStr = numberStr.substring(index + 1);
        }else{
            numberStr = "暂无类型";
        }
        return numberStr;
    }
}
