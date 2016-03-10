package com.laozhang.corejava.day02;

import java.util.Scanner;

/**
 * 获取数字的各个位数上的数字
 */
public class PrintNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入一个三位数:");
		int i = sc.nextInt();
		if (i < 100 || i >= 1000) {
			System.out.println("您的输入有误!");
		} else {
			int b = i / 100;// 获取百位
			int s = i / 10 % 10;// 获取十位
			int g = i % 10;// 获取个位
			System.out.print("百位:" + b);
			System.out.print(",十位:" + s);
			System.out.print(",个位:" + g);
		}
	}
}
