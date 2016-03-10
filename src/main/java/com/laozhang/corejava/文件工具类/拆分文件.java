package com.laozhang.corejava.文件工具类;

import java.util.Scanner;

public class 拆分文件 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入需拆分文件的路径:");
		String file = console.nextLine();
		IOUtils.split(file, 30);
		System.out.println("拆分成功!");
	}
}
