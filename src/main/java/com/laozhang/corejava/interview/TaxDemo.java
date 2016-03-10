package com.laozhang.corejava.interview;

import java.util.*;

public class TaxDemo {
	public static void main(String[] args) {
		System.out.println("请输入您的月工资：");
		Scanner sc = new Scanner(System.in);
		double tax = sc.nextDouble();
		double p1 = 500 * 0.05;
		double p2 = p1 + (2000 - 500) * 0.1;
		double p3 = p2 + (5000 - 2000) * 0.15;
		double p4 = p3 + (20000 - 5000) * 0.2;
		double p5 = p4 + (40000 - 20000) * 0.25;
		double p6 = p5 + (60000 - 40000) * 0.3;
		double p7 = p6 + (80000 - 60000) * 0.35;
		double p8 = p7 + (100000 - 80000) * 0.4;
		tax -= 2000;
		if (tax < 0) {
			System.out.println("您不需要缴纳税务！");
			return;
		}
		if (tax >= 0 && tax < 500) {
			tax = tax * 0.05;
		} else if (tax < 2000) {
			tax = p1 + (tax - 500) * 0.1;
		} else if (tax < 5000) {
			tax = p2 + (tax - 2000) * 0.15;
		} else if (tax < 20000) {
			tax = p3 + (tax - 5000) * 0.2;
		} else if (tax < 40000) {
			tax = p4 + (tax - 20000) * 0.25;
		} else if (tax < 60000) {
			tax = p5 + (tax - 40000) * 0.3;
		} else if (tax < 80000) {
			tax = p6 + (tax - 60000) * 0.35;
		} else if (tax < 100000) {
			tax = p7 + (tax - 80000) * 0.4;
		} else if (tax >= 100000) {
			tax = p8 + (tax - 100000) * 0.45;
		}
		System.out.println("您需缴纳的税款额为：" + tax);
	}
}
