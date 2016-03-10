package com.laozhang.corejava.day04;

import java.util.Arrays;

/**
 * 本类用来演示数组的排序
 */
public class ArraySortDemo {
	public static void main(String[] args) {
		int[] arr = { 32, 43, 546, 37, 57, 123 };
		// method1(arr);
		//method2(arr);
		method3(arr);
	}

	// 最常用,Arrays.sort(数组名);
	public static void method1(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	// 冒泡排序:从小到大排序
	public static void method2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// 定义变量临时存放元素值
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	// 冒泡排序:从大到小排序
	public static void method3(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					// 定义变量临时存放元素值
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
