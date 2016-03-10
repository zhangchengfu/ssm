package com.laozhang.corejava.文件工具类;

import java.util.Scanner;

public class 打印文件 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入需打印文件的路径:");
		String file = console.nextLine();
		IOUtils.print(file);
	}
}