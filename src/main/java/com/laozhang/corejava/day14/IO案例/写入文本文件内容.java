package com.laozhang.corejava.day14.IO案例;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class 写入文本文件内容 {
	public static void main(String[] args) throws IOException {
		String file = "sync.txt";
		Scanner console = new Scanner(System.in);
		System.out.println("请输入内容:");
		PrintWriter out = new PrintWriter(new OutputStreamWriter(
				new FileOutputStream(file), "utf-8"));
		while (true) {
			String str = console.nextLine();
			out.println(str);
			out.flush();
			if (str.equals("quit")) {
				break;
			}
			System.out.println("写入完成!");
		}
		out.close();
	}
}