package com.laozhang.corejava.day14.IO案例;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.laozhang.corejava.文件工具类.IOUtils;


public class 基本类型数据输出的功能扩展 {
	public static void main(String[] args) throws IOException {
		String file = "dos.txt";
		// 打开作为输出, 写文件
		OutputStream out = new FileOutputStream(file);
		// 将long类型写入到流中
		long i = 0x7fffffffffffffffL;// -1L>>>1;
		out.write((int) (i >>> 56));
		out.write((int) (i >>> 48));
		out.write((int) (i >>> 40));
		out.write((int) (i >>> 32));
		out.write((int) (i >>> 24));
		out.write((int) (i >>> 16));
		out.write((int) (i >>> 8));
		out.write((int) (i));
		// DOS 依赖于一个基本流, 为基本流扩展了"基本类型的输出"
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeLong(i);// 将long拆开为8个byte写入到out中
		dos.writeDouble(3.14);
		dos.close();// 关闭最外部的流
		IOUtils.print(file);
	}
}