package com.laozhang.corejava.day14.IO案例;

import java.util.Properties;

public class 显示系统信息 {
	public static void main(String[] args) {
		Properties config = System.getProperties();
		config.list(System.out);
		String encoding = config.getProperty("file.encoding");
		System.out.println(encoding);
	}
}
