package com.laozhang.corejava.day14.IO案例;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class 文件信息系统 {
	public static void main(String[] args) throws IOException {

		// 显示文件路径
		File current = new File(".");
		String path = current.getCanonicalPath();
		System.out.println("当前文件路径为:" + path);

		// 创建文件夹
		File dir = new File("demo");
		if (!dir.exists()) {
			dir.mkdir();
		}
		System.out.println(dir.exists());
		System.out.println("文件夹创建成功!");

		// 检查文件是否存在(不存在就创建文件)
		File file = new File(dir, "test.txt");
		System.out.println(file.exists());
		if (!file.exists()) {
			file.createNewFile();
		}
		System.out.println(file.getParent());// 显示文件所在的文件夹
		System.out.println(new Date(file.lastModified()));// 显示文件最后修改的时间
		System.out.println(file.isDirectory());// 是否为文件夹
		System.out.println(file.isFile());// 是否为文件
		// file.delete();
		// dir.delete();//只能删除空文件夹!
	}
}
