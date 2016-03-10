package com.laozhang.corejava.文件工具类;

import java.util.Scanner;

public class 合并文件 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入第一个分文件的路径:");
		String file = console.nextLine();
		IOUtils.join(file);
		System.out.println("合并成功!");
	}
}
