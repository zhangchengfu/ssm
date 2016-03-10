package com.laozhang.corejava.util;

import java.util.Scanner;

/**
 * 本工具类的作用是用来获取用户键盘输入
 */
public class InputDataUtil {
	/**
	 * 获取用户键盘输入的整数
	 */
	public static int inputInt(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int result = sc.nextInt();
		return result;
	}

	/**
	 * 获取用户键盘输入的小数
	 */
	public static double inputDouble(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		double result = sc.nextDouble();
		return result;
	}

	/**
	 * 获取用户键盘输入的一整行
	 */
	public static String inputLine(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String result = sc.nextLine();
		return result;
	}
}
