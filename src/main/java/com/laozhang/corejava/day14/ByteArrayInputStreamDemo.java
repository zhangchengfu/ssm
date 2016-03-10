package com.laozhang.corejava.day14;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @描述 ByteArrayInputStream演示
 * @日期 May 15, 2013 4:39:22 PM
 * @作者 JSD1304
 */
public class ByteArrayInputStreamDemo {
	public static void main(String[] args) {
		String source = "俗下Odsd渡征汛";
		System.out.println(source.getBytes().length);// 字符数组的长度
		System.out.println(source.length());// 字符串字符个数

		// 创建ByteArrayInputStream
		ByteArrayInputStream bis = new ByteArrayInputStream(source.getBytes());
		// 创建输出流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		// 打印一下,当前源中的数据长度
		System.out.println("bis中可以获取的字节数为:" + bis.available());

		// 循环读取,定义存放数据的缓存
		byte[] buf = new byte[4];// 每次读取4个字节
		int len = -1;// 用来保存实际读取到的字节数
		int total = 0;// 用来保存总共读取到的字节数
		while ((len = bis.read(buf, 0, buf.length)) != -1) {
			total += len;
			System.out.printf("本次读取到[%d]个字节,还剩下[%d]个字节.\n", len, bis
					.available());
			// 业务方法(做一次加密处理),写入到字节输入流中
			for (int i = 0; i < len; i++) {
				buf[i] = (byte) (buf[i] ^ 5);
			}
			// 写到输出流中
			bos.write(buf, 0, len);
		}
		System.out.println("===去读完毕===");
		System.out.printf("本次一共读取了[%d]个字节.\n",total);
		
		//输入处理后的结果
		byte[] results = bos.toByteArray();//把输出流中的信息转换成byte数组
		String result = new String(results);//把byte数组转换成字符串
		System.out.println("===加密后的内容为===");
		System.out.println(result);
	}
}
