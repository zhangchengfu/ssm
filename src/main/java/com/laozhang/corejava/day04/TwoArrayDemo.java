package com.laozhang.corejava.day04;

/**
 * 本类用来演示二维数组
 */
public class TwoArrayDemo {
	public static void main(String[] args) {
		// 定义
		// 1.先声明二维数组
		int[][] arr1 = new int[3][3];
		int arr2[][] = new int[3][3];
		String[][] arr3 = new String[3][];

		// 2.赋值
		// 1)通过制定下标来赋值
		arr1[0] = new int[] { 1, 2, 3 };
		arr1[1] = new int[] { 4, 5, 6 };
		arr1[2] = new int[] { 2, 3, 8 };

		// 2)创建数组的同时直接赋值
		int[][] arr4 = { { 1, 2, 3 }, { 4, 5, 6 }, { 2, 3, 8 } };
		
		
		//通过指定的坐标获取某一个值
		arr4[1][1] = 888;
		System.out.println(arr4[1][1]);
		
		
		//遍历
		for(int i = 0;i < arr4.length;i++){
			for(int j = 0;j < arr4[i].length;j++){
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
	}
}
