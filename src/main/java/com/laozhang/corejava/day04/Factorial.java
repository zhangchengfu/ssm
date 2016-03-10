package com.laozhang.corejava.day04;

/**
 * 本类用来演示递归调用
 * 1 1 2 3 5 8 13 21
 */
public class Factorial {
	public static void main(String[] args) {
		long l = fibonacci(40);
		System.out.println(l);
	}
	
	public static long fibonacci(int n) {
	    //指定退出条件
		//如果不指定递归出口,则会堆栈溢出
	    if(n == 1 || n == 2) {
	    	return 1;
	    }
	    return fibonacci(n-1) + fibonacci(n - 2);
	}
}
