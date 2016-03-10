package com.laozhang.corejava.day02;

import java.util.Scanner;

/**
 * 本类用来验证密码的合法性 如果偶数项的和等于8,则是合法密码,而且密码必须是6位数
 */
public class PasswordTest {
	public static void main(String[] args) {
		// 获取用户输入
		Scanner sc = new Scanner(System.in);
		// 提示
		System.out.println("请您输入密码:");
		// 获取一整行用户输入
		String password = sc.nextLine();
		// 定义变量来存放偶数项的和
		int result = 0;
		// 判断,如果输入密码长度不是6位数,则提示非法输入
		if (password.length() != 6) {// 返回字符串的长度
			System.out.println("输入不合法!");
		} else {
			// 循环获取用户输入的密码的偶数项,然后转换着数字,并且累加
			for (int i = 1; i < password.length(); i += 2) {
				// 字符串中的charAt(int index)方法,可以获取指定字符串中
				// 指定下标的字符,下标从0开始,到length()-1结束
				result += (password.charAt(i) - '0');
			}
			// 判断累加值是否是要求的数字,如果是则通过,反之则不通过
			if (result == 8) {
				System.out.println("恭喜您登录成功!");
			} else {
				System.out.println("密码错误!");
			}
		}
	}
}
