package com.laozhang.corejava.day04.homework;

import java.util.Scanner;

/**
 * 输出杨辉三角. 输出如下: 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1 1 5 10 10 5 1 1 6 15 20 15 6 1 1
 * 7 21 35 35 21 7 1
 * 
 * @author Administrator
 * 
 */
public class YangHui_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入要打印的行数n=");
			int n = sc.nextInt();
			if (n < 0) {
				System.out.println("您输入的数有误,请重新输入!");
				
			} else if(n==0) {
				System.out.println("游戏结束!!!");
				break;
			}else{
				System.out.println("---------------------------");
				int[][] arr = new int[n][n];// 创建了一个8行的二维数组
				// 开始赋值
				for (int i = 0; i < n; i++) {
					for (int j = 0; j <= i; j++) {
						if (j == 0 || j == i) {
							arr[i][0] = 1;
							arr[i][i] = 1;
						} else {
							arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
						}
					}

				}
				print(arr, n);
			}
		}
		// 遍历
		// int k=14;
		/*
		 * for(int i=0;i<n;i++){ for(int j=0;j<=i;j++){
		 * System.out.printf("%-4d",arr[i][j]); } System.out.println(); }
		 */
	}

	// 打印框体
	public static void print(int[][] arr, int n) {
		// num是要打印的第几行,n是总行数
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= (n - i); j++) {
				System.out.printf("%-2s", "");
			}
			for (int j = 0; j <= i; j++) {
				System.out.printf("%-4d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
