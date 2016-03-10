package com.laozhang.corejava.day14.IO案例;

import java.io.File;

public class 列出指定目录下的文件名 {
	public static void main(String[] args) {
		File root = new File("c:/Program Files");
		File[] files = root.listFiles();
		for (File file : files) {// java 5 提供的简化版数组迭代
			if (file.isDirectory()) {
				System.out.println("[" + file.getName() + "]");
			} else {
				System.out.println(file.getName());
			}
		}
	}
}