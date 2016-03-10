package com.laozhang.corejava.day14.IO案例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.laozhang.corejava.文件工具类.IOUtils;

public class 字符串的编码与解码 {
	public static void main(String[] args) throws IOException {

		// utf16
		String utf16File = "utf16.txt";
		String str = "ABCD中国";
		byte[] utf16 = str.getBytes("UTF-16BE");
		OutputStream out = new FileOutputStream(utf16File);
		out.write(utf16);
		out.close();
		System.out.print("UTF-16BE:");
		IOUtils.print(utf16File);

		// utf-8
		System.out.print("UTF-8:");
		byte[] utf8 = str.getBytes("UTF-8");
		String utf8File = "utf8.txt";
		out = new FileOutputStream(utf8File);
		out.write(utf8);
		out.close();
		IOUtils.print(utf8File);

		// GBK
		System.out.print("GBK:");
		byte[] gbk = str.getBytes("GBK");
		String gbkFile = "gbk.txt";
		out = new FileOutputStream(gbkFile);
		out.write(gbk);
		out.close();
		IOUtils.print(gbkFile);

		// ISO 8859-1
		System.out.print("ISO 8859-1:");
		byte[] iso = str.getBytes("ISO8859-1");
		String isoFile = "iso.txt";
		out = new FileOutputStream(isoFile);
		out.write(iso);
		out.close();
		IOUtils.print(isoFile);

		// 读取文字:
		InputStream in = new FileInputStream(utf8File);
		byte[] buf = new byte[in.available()];
		in.read(buf);// 读取文件的全部内容, 是UTF-8编码的数据
		in.close();
		// 解码 utf-8
		String s = new String(buf, "UTF-8");// 解码为字符串
		System.out.println("读取utf-8:" + s);

		// 乱码现象: 文字的编码和解码方案不一致造成!
		String err = new String(buf, "GBK");
		System.out.println("乱码(GBK解析UTF-8):" + err);
	}
}
