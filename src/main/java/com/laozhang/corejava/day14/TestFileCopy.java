package com.laozhang.corejava.day14;

/**
 * @描述 文件复制测试类
 * @日期 May 15, 2013 1:57:21 PM
 * @作者 JSD1304
 */
public class TestFileCopy {
	public static void main(String[] args) {
		String src = "F:\\IO\\CoreJava\\day14笔记.txt";
		String target = "F:\\IO\\CoreJava\\day14笔记(副本).txt";
		FileCopy.copy(src, target);
	}
}
