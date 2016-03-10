package com.laozhang.corejava.day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @描述 本类用来演示字符流
 * @日期 May 15, 2013 3:47:59 PM
 * @作者 JSD1304
 */
public class ReaderDemo {
	public static void main(String[] args) {
		ReaderDemo rd = new ReaderDemo();
		rd.clearSpaceLine("F:\\IO\\CoreJava\\day14笔记.txt",
				"F:\\IO\\CoreJava\\day14笔记(精简版).txt");
	}

	/**
	 * 本方法可以把指定文本文件中的空行全部去除
	 */
	public void clearSpaceLine(String src, String dest) {
		// 构建流
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader(src));
			pw = new PrintWriter(dest);// 直接以文件名来构建

			// 定义变量
			String line = null;
			// 循环读取
			while (true) {
				line = br.readLine();// 直接去读一行

				// 判断读取完毕
				if (line == null) {
					break;
				}
				// 判断此行是否为空行
				if (line.length() == 0 || line.trim().length() == 0) {
					continue;// 结束本轮循环,继续执行下一次
				}
				// 写入到目标文件
				pw.println(line);
			}
			System.out.println("执行成功...");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
		}
	}
}
