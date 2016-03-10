package com.laozhang.corejava.day03;

/**
 * 本类用来演示break和continue
 */
public class BreakContinueDemo {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 3 == 0) {
					break;//退出里面的for循环
				}
				System.out.printf("%d*%d=%-4d", j, i, i * j);
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 3 == 0) {
					continue;//跳出本轮循环继续执行下一次
				}
				System.out.printf("%d*%d=%-4d", j, i, i * j);
			}
			System.out.println();
		}
	}
}
