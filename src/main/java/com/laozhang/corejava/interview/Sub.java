package com.laozhang.corejava.interview;

public class Sub extends Super {
	int j = 30;

	public Sub() {
		super();
		print();
		j = 40;
	}

	public void print() {
		System.out.println(j);
	}

	public static void main(String[] args) {
		System.out.println(new Sub().j);
	}
}
