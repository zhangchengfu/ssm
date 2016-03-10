package com.laozhang.corejava.interview;

public class SBF {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("A");
		StringBuffer str2 = new StringBuffer("B");
		method(str1, str2);
		System.out.println(str1 + ":" + str2);
	}

	public static void method(StringBuffer str1, StringBuffer str2) {
		str1.append(str2);
		str2 = str1;
		System.out.println(str1 + ":" + str2);
	}

}
