package com.laozhang.corejava.文件工具类;

import java.util.Scanner;

public class 复制文件 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入需复制文件的路径:");
		String file = console.nextLine();
		IOUtils.cp(file, "F:/副本");
		System.out.println("复制成功!");
	}
}
