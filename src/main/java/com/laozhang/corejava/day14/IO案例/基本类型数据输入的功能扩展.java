package com.laozhang.corejava.day14.IO案例;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class 基本类型数据输入的功能扩展 {
	public static void main(String[] args) throws IOException {
		String file = "dos.txt";
		InputStream in = new FileInputStream(file);
		// DataInputStream 为基本的字节输入流扩展到基本数据类型
		// 读取功能,如:readInt() readLong()..., DIS 必须依赖in
		DataInputStream dis = new DataInputStream(in);
		long l = dis.readLong();
		System.out.println(l);
		l = dis.readLong();
		System.out.println(Long.toHexString(l));
		double d = dis.readDouble();
		System.out.println(d);
		dis.close();
	}
}
