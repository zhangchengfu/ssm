package com.laozhang.corejava.day07;

/**
 * 本类用来演示字符串处理
 */
public class StringDemo {
	public static void main(String[] args) {
		//采用串池来创建字符串
		String str1 = "Hello,World!";
		String str2 = "Hello,World!";
		System.out.println(str1 == str2);
		
		//采用new方式
		String str3 = new String("Hello,World!");
		String str4 = new String("Hello,World!");
		System.out.println(str3 == str4);
		
		//字符串拼接效率测试
		
		//采用+拼接
//		long start = System.currentTimeMillis();
//		String s = "你好!";
//		for(int i = 0;i < 10000;i++){
//			s += "你好!";//因为产生大量的临时对象
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		
		
		//采用StringBuilder中的append()方法拼接
		long start = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("你好!");
		for(int i = 0;i < 1000000;i++){
			builder.append("你好!");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}	
