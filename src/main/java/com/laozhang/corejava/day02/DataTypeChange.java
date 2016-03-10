package com.laozhang.corejava.day02;

/**
 * 本类用来演示数据类型转换 1.强制类型转换 2.自动类型转换(隐式类型转换)
 */
public class DataTypeChange {
	public static void main(String[] args) {

		// byte < short < int < long
		// float < double

		// 自动类型转换:不需要人为干预
		// 从较小的数据类型向较大的数据类型转换
		long l = 100;
		double d = 3;

		// 强制类型转换:人为干预
		// 从较大的数据类型向较小的数据类型转换
		// 强转语法:
		// 类型 变量名 = (类型)值;
		// 强转过后可能损失精度

		int i = (int) 3.99;
		int j = (int) 1000L;
		System.out.println(i);

		// 特例:float,double,long强转特殊写法
		// 在数值后面可以加上L/l,D/d,F/f
	}
}
