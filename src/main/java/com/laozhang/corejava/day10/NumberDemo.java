package com.laozhang.corejava.day10;

/**
 * @描述 数字类型演示
 * @日期 May 9, 2013 4:22:55 PM
 * @作者 JSD1304
 */
public class NumberDemo {
	public static void main(String[] args) {
		//Integer
		Integer i1 = 3;//自动封箱
		int i2 = i1;//自动解箱子
		
		System.out.println(Integer.toBinaryString(3));//二进制
		System.out.println(Integer.toHexString(8));//16进制
		
		//Character
		char c1 = '7';
		char c2 = 'A';
		char c3 = ' ';
		System.out.println(Character.isDigit(c1));//判断是否是数字
		System.out.println(Character.isLetter(c2));//判断是否是字母
		System.out.println(Character.isWhitespace(c3));//判断是否是空格
		System.out.println(Character.isUpperCase(c2));//判断是否是大写字母
		System.out.println(Character.isLowerCase(c2));//判断是否是小写字母
	}
}
