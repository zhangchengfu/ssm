package com.laozhang.corejava.day02;

/**
 * 本类用来演示JAVA运算符
 */
public class Operate {
	public static void main(String[] args) {
		// +,-,*,/,%
		System.out.println(1 + 2);
		// 加号两边只要有一个是字符串,则此加号功能为字符串拼接
		System.out.println("1" + 2);
		System.out.println(13 - 2);
		System.out.println(2 * 3);
		System.out.println(3 / 2);// 1,整型除以整型还是整型
		System.out.println(100 % 3);

		int i = 3;
		i += 1;// i = i + 1;
		// 此两种写法基本可以互换,但是稍有不同
		// i += 1这种写法更加好,可以避免类型转换问题
		System.out.println(i);

		// 不管是前++还是后++,原本的值都会自增
		// 前++是先自增,再赋值,所以,表达式也自增了
		// 后++是先赋值,再自增,所以,表达式值没有变
		int a1 = 10;
		int b1 = a1++;
		System.out.println(a1);// 11
		System.out.println(b1);// 10

		int a2 = 10;
		int b2 = ++a2;
		System.out.println(a2);// 11
		System.out.println(b2);// 11

		// 位移运算
		System.out.println(10 << 3);// 10 * 2 * 2 * 2

		// 比较运算符
		System.out.println(2 != 3);
		System.out.println(2 < 3);

		// 逻辑运算符 && || !
		boolean bool1 = true;
		boolean bool2 = false;
		boolean b = bool1 && bool2;// false
		b = bool1 || bool2;// true
		b = !bool1;// false

		// 位运算
		System.out.println(5 & 7);// 5
		System.out.println(5 | 7);// 7
		System.out.println(5 ^ 7);// 2
		// 一个数异或同一个数两次,结果是它本身
		System.out.println(5 ^ 7 ^ 7);// 5

		// 按位取反
		System.out.println(~5);
	}
}
