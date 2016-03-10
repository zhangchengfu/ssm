package com.laozhang.corejava.day04;

import java.util.Arrays;

/**
 * 本类用来演示JAVA参数传递的两种方式
 * 1.基本类型值传递
 * 2.对象类型引用传递
 */
public class TransferDemo {
	public static void main(String[] args) {
//		int i = 10;
//		swap(i);
//		System.out.println(i);
		
		int[] a = {1,2,3};
		swap(a);
		System.out.println(Arrays.toString(a));
	}
	
	//基本类型
	public static void swap(int i){
		i++;
	}
	
	//对象类型
	public static void swap(int[] a){
		for(int i = 0;i < a.length;i++){
			a[i] += 1;
		}
	}
}
