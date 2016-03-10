package com.laozhang.corejava.day02;

import java.util.Scanner;

/**
 * 设计一个程序,用户输入密码时候返回加密后的密码,再输入一个数字过后,可以解密得到原密码.
 */
public class EncryptDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入信息:");
		int result = sc.nextInt();
		System.out.println("请您输入加密方式:");
		System.out.println("---1.方式一---");
		System.out.println("---2.方式二---");
		System.out.println("---3.方式三---");
		int choice = sc.nextInt();
		System.out.println("加密中...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (choice == 1) {
			System.out.println("加密结果为:" + (result ^ 8));
		} else if (choice == 2) {
			System.out.println("加密结果为:" + (result ^ 88));
		} else if (choice == 3) {
			System.out.println("加密结果为:" + (result ^ 888));
		} else {
			System.out.println("您的输入有误!");
		}
		System.out.println("是否需要解密(1/2):");
		int cmd = sc.nextInt();
		if (cmd == 1) {
			System.out.println("请您输入解密码:");
			int code = sc.nextInt();
			if (code == 8 || code == 88 || code == 888) {
				System.out.println("解密中...");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("解密结果为:" + result);
			} else {
				System.out.println("非法入侵!");
			}
		} else if (cmd == 2) {
			System.out.println("(:亲,谢谢使用!");
		} else {
			System.out.println("您的输入有误!");
		}
	}
}
