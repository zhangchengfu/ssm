package com.laozhang.corejava.day14;

/**
 * @描述 File类的测试类
 * @日期 May 15, 2013 9:56:35 AM
 * @作者 JSD1304
 */
public class TestFileDemo {
	public static void main(String[] args) {
		FileDemo fd = new FileDemo();
		
		//创建新文件夹
		//fd.newFolder("F:\\IO\\CoreJava");
		
		//创建文件
		//fd.newFile("F:\\IO\\CoreJava\\day14笔记.txt");
		
		//罗列文件和文件夹
		fd.printFile("C:\\Program Files");
	}
}
