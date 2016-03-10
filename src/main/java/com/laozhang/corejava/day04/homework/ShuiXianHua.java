package com.laozhang.corejava.day04.homework;

public class ShuiXianHua {
	public static void main(String[] args) {
		ShuiXianHua sxh = new ShuiXianHua();
		sxh.printNumber();
	}

	public void printNumber() {
		for (int i = 100; i < 1000; i++) {
			int g = i % 10;// 个位
			int s = i / 10 % 10;// 十位
			int b = i / 100;// 百位
			if (g * g * g + s * s * s + b * b * b == i) {
				System.out.print(i + " ");
			}
		}
	}
}
