package com.laozhang.corejava.day13;

/**
 * @描述 测试自定义泛型类
 * @日期 May 14, 2013 11:04:39 AM
 * @作者 JSD1304
 */
public class TestEntry {
	public static void main(String[] args) {
		Entry<String, Integer> e1 = new Entry<String, Integer>("密码", 123456);
	}
}
