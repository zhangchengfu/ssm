package com.laozhang.corejava.interview;

public class TestInteger {
	public static void main(String[] args) {
		Integer a = 128;
		Integer b = 128;
		
//		Integer a = Integer.valueOf(128);
//		Integer b = Integer.valueOf(128);
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
