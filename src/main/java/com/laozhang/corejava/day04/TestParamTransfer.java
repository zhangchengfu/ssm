package com.laozhang.corejava.day04;

import java.util.Arrays;

public class TestParamTransfer {

	public static void main(String[] args) {
		ParamTransfer pt = new ParamTransfer();
		int i = 10;
		int j = 5;
		System.out.printf("交换前：i=%d,j=%d\n"
						,i,j);
		pt.swap(i, j);
		System.out.printf("交换后：i=%d,j=%d\n"
				,i,j);
		
		System.out.println("//-------------------");
		int[] a = {100,200,300};
		int[] b = {1,2,3};
		pt.swap(a, b);
		System.out.println("交换后:");
		System.out.println("数组a:"+
				Arrays.toString(a));
		System.out.println("数组b:"+
				Arrays.toString(b));
	}
}
