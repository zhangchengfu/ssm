package com.laozhang.corejava.day02;

/**
 * 本类用来演示三目运算符
 */
public class Test {

	// 1.运行结果可以是任意数据类型

	// 2.条件可以是复合语句
	// 表达式:由变量和运算符所组成的合法语句
	// 复合语句:由多个表达式组成的合法语句

	// 3.冒号前后没有逻辑运算能力,只存在前后的关系
	// 也就是说条件成立就会执行冒号前面部分,反之执行后面部分
	public static void main(String[] args) {
		System.out.println(59 < 60 ? "不及格" : "及格");
	}
}
