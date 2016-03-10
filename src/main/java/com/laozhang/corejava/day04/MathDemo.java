package com.laozhang.corejava.day04;

/**
 * 本类用来演示Math的使用
 * @author Administrator
 * @创建时间 Feb 4, 2013
 * @package com.corejava.day04
 * @文件名 MathDemo.java
 */
public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.abs(-5));	//求绝对值
		System.out.println(Math.PI);//得到PI值
		System.out.println(Math.sqrt(8));//返回a的开根号
		System.out.println(Math.pow(2,4));//求a的b次方
		System.out.println(Math.max(45, 23));//比较并返回较大的数字
		System.out.println(Math.min(45, 23));//比较并返回较小的数字
		System.out.println(Math.random());//产生[0,1)随机数,返回类型是double
	}
}
