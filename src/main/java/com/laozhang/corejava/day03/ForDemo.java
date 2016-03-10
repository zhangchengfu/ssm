package com.laozhang.corejava.day03;

/**
 *	本类用来演示for循环
 */
public class ForDemo {
	public static void main(String[] args) {
		printStar();
	}
	
	//打印如下图形
//	*
//	**
//	***
//	****
//	*****
//	****
//	***
//	**
//	*
	public static void printStar(){
		for(int i = 1; i <= 5;i++){//外层for循环控制行数
			for(int j = 1;j <= i;j++){//内层for循环控制列数
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 4; i >= 1;i--){//外层for循环控制行数
			for(int j = i;j >= 1;j--){//内层for循环控制列数
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}
