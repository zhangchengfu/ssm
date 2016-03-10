package com.laozhang.corejava.day14.IO案例;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 输出流演示 {
	public static void main(String[] args) throws IOException {
		String file = "output.txt";
		OutputStream out = new FileOutputStream(file);
		out.write(0x41);// 写入A
		out.write(0x42);// 写入B
		byte[] buf = "中国".getBytes("GBK");
		out.write(buf);// 重载的write(byte[])
		out.flush();// 清理磁盘缓存, 保证可靠写入文件
		out.close();// 清理缓存, 关闭文件
		System.out.println("写入成功!");
	}
}
