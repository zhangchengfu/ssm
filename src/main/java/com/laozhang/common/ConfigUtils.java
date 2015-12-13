package com.laozhang.common;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * 配置文件工具类
 * @author Lenovo
 *
 */
public class ConfigUtils {
	
	final static MessageFormat FORMAT = new MessageFormat("");
	
	/**
     * 获取系统配置文件
     * @param key
     * @return
     */
    public static String getSysConfig(String key) {
     ResourceBundle rb = ResourceBundle.getBundle("system");
        return rb.getString(key);
    }
    
    /**
     * 单一参数的Message
     * 
     * @param key message key
     * @param arg0 参数1
     * @return Message内容
     */
    public static String getSysConfig(String key, String arg0) {
        String mes = getSysConfig(key);
        FORMAT.applyPattern(mes);
        return FORMAT.format(new String[] { arg0 });
    }
    
    /**
     * 两个参数的Message
     * 
     * @param key message key
     * @param arg0 参数1
     * @param arg1 参数2
     * @return Message内容
     */
    public static String getSysConfig(String key, String arg0, String arg1) {
        String mes = getSysConfig(key);
        FORMAT.applyPattern(mes);
        return FORMAT.format(new String[] { arg0, arg1 });
    }
    
    /**
     * 三个参数的Message
     * 
     * @param key message key
     * @param arg0 参数1
     * @param arg1 参数2
     * @param arg2 参数3
     * @return Message内容
     */
    public static String getSysConfig(String key, String arg0, String arg1, String arg2) {
        String mes = getSysConfig(key);
        FORMAT.applyPattern(mes);
        return FORMAT.format(new String[] { arg0, arg1, arg2 });
    }
    
    /**
     * 四个参数的Message
     * 
     * @param key message key
     * @param arg0 参数1
     * @param arg1 参数2
     * @param arg2 参数3
     * @param arg3 参数4
     * @return Message内容
     */
    public static String getSysConfig(String key, String arg0, String arg1, String arg2, String arg3) {
        String mes = getSysConfig(key);
        FORMAT.applyPattern(mes);
        return FORMAT.format(new String[] { arg0, arg1, arg2, arg3});
    }
}
