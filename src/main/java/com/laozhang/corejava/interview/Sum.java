package com.laozhang.corejava.interview;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������֣�");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			int y1 = f1(number);
			System.out.println("ż���Ϊ:" + y1);
		} else {
			int y2 = f2(number);
			System.out.println("�����Ϊ:" + y2);
		}
	}

	// ����ż���
	private static int f1(int n1) {
		if (n1 == 0) {
			return 0;
		}
		return f1(n1 - 2) + n1;
	}

	// ���������
	private static int f2(int n2) {
		if (n2 == 1) {
			return 1;
		}
		return f2(n2 - 2) + n2;
	}

}
