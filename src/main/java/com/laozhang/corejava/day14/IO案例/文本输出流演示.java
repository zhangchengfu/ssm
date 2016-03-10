package com.laozhang.corejava.day14.IO案例;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class 文本输出流演示 {
	public static void main(String[] args) throws IOException {
		String file = "textoutput.txt";
		OutputStream out = new FileOutputStream(file);
		Writer writer = new OutputStreamWriter(out, "utf-8");
		writer.write("SYHJJ");
		PrintWriter pw = new PrintWriter(writer);// 在拓展
		pw.println("你好,I'm SYHJJ");
		pw.close();
		System.out.println("输出完成!");
	}
}
