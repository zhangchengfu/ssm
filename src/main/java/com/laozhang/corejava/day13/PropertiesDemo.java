package com.laozhang.corejava.day13;

import java.util.Properties;

/**
 * @描述 本类用来演示属性类
 * @日期 May 14, 2013 10:07:02 AM
 * @作者 JSD1304
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties ps = System.getProperties();
		System.out.println(ps);
		
		String s1 = ps.getProperty("os.name");
		System.out.println(s1);
		
		String s2 = ps.getProperty("user.name");
		System.out.println(s2);
	}
}
