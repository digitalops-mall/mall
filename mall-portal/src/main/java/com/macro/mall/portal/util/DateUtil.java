package com.macro.mall.portal.util;

import io.micrometer.core.instrument.util.StringUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * Created by macro on 2019/1/29.
 */
public class DateUtil {

    /**
     * 从Date类型的时间中提取日期部分
     */
    public static Date getDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }

    /**
     * 从Date类型的时间中提取时间部分
     */
    public static Date getTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.YEAR, 1970);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    /*
     * unicode编码转中文
     */
    public static String decodeUnicode( String dataStr) {
        try {
            StringBuffer buffer = new StringBuffer(dataStr == null ? "" : dataStr);
            if (StringUtils.isNotBlank(dataStr) && dataStr.contains("\\u")) {
                buffer.delete(0, buffer.length());
                int start = 0;
                int end = 0;
                while (start > -1) {
                    end = dataStr.indexOf("\\u", start + 2);
                    String a = "";//如果夹着非unicode编码的字符串，存放在这
                    String charStr = "";
                    if (end == -1) {
                        if (dataStr.substring(start + 2, dataStr.length()).length() > 4) {
                            charStr = dataStr.substring(start + 2, start + 6);
                            a = dataStr.substring(start + 6, dataStr.length());
                        } else {
                            charStr = dataStr.substring(start + 2, dataStr.length());
                        }
                    } else {
                        charStr = dataStr.substring(start + 2, end);
                    }
                    char letter = (char) Integer.parseInt(charStr.trim(), 16); // 16进制parse整形字符串。
                    buffer.append(new Character(letter).toString());
                    if (StringUtils.isNotBlank(a)) {
                        buffer.append(a);
                    }
                    start = end;
                }
            }
            return buffer.toString();
        } catch (Exception e) {
            System.out.println(" 字符串转换失败");
        }
        return dataStr;
    }


    public static void main(String[] args) {
        String s = decodeUnicode("\\uff1a\\u7238\\u5988\\uff0c\\u6211\\u540c\\u5a77\\u7ffb\\u6765\\u5403");
        System.out.println(s);
    }
}
