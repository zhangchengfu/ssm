package com.laozhang.xml.解析属性文件;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Test {
	public static void main(String[] args) {
		//构建方式1
		InputStream in1 = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("com\\xml\\解析属性文件\\abc.properties");
		//构建方式2
		InputStream in2 = null;
		
		try {
			in2 = new FileInputStream(
					"F:\\workspace\\XML\\src\\com\\xml\\解析属性文件\\abc.properties");
			Properties prop = new Properties();
			prop.load(in2);
			String name = prop.getProperty("username");
			String password = prop.getProperty("password");
			System.out.println("用户名: " + name);
			System.out.println("密码: " + password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
