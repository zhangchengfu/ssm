package com.laozhang.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileEncAndDec {
	private static final int numOfEncAndDec = 0x99;// 加密解密秘钥
	private static int dataOfFile = 0;// 文件字节内容

	public static void main(String[] args) {
		File srcFile = new File("D:/个人资料/jsb.txt");// 初始文件
		File encFile = new File("C:/Users/Lenovo/Desktop/enc.txt");// 加密文件
		File decFile = new File("C:/Users/Lenovo/Desktop/dec.txt");// 解密文件

		try {
			//encFile(srcFile, encFile);
			decFile(encFile, decFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void encFile(File srcFile, File encFile) throws Exception {
		if (!srcFile.exists()) {
			return;
		}

		if (!encFile.exists()) {
			encFile.createNewFile();
		}

		InputStream inputStream = new FileInputStream(srcFile);
		OutputStream outputStream = new FileOutputStream(encFile);

		while ((dataOfFile = inputStream.read()) > -1) {
			outputStream.write(dataOfFile ^ numOfEncAndDec);
		}

		inputStream.close();
		outputStream.flush();
		outputStream.close();
	}

	private static void decFile(File encFile, File decFile) throws Exception {
		if (!encFile.exists()) {
			return;
		}

		if (!decFile.exists()) {
			decFile.createNewFile();
		}

		InputStream inputStream = new FileInputStream(encFile);
		OutputStream outputStream = new FileOutputStream(decFile);

		while ((dataOfFile = inputStream.read()) > -1) {
			outputStream.write(dataOfFile ^ numOfEncAndDec);
		}

		inputStream.close();
		outputStream.flush();
		outputStream.close();
	}
}
