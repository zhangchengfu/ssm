package com.laozhang.corejava.day14.IO案例;

import java.io.File;
import java.io.FileFilter;

public class 查找指定文件夹中的特定文件 {
	public static void main(String[] args) {
		File etc = new File("c:/windows");
		File[] files = etc.listFiles(new FileFilter() {
			public boolean accept(File file) {
				return file.getName().matches("^[cp].*");
			}
		});
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}
