package com.laozhang.corejava.day02;

/**
 * 本类用来演示数据类型的定义
 */
public class DataTypeDemo {
	public static void main(String[] args) {

		// 定义整型数据类型
		byte b = 127;
		b = 125;
		// 变量改变值,不能再声明类型了,否早造成重复定义变量
		// 每对大括号中只能定义一遍某变量

		short s = 32767;
		int i = 2147483647;
		long l = 1000L;
		// long l = 1000l;
		// long l = (long)1000;

		// 输出
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		// 定义小数数据类型
		// float f = 3.14;错误,因为Java中任意小数默认是double类型
		float f = 3.14f;// 3.14F/(float)3.14
		double d = 3.14;
		// 输出
		System.out.println("f = " + f);
		System.out.println("d = " + d);

		// 定义字符型

		// 用字符定义
		char c1 = '您';
		// 用制表符定义
		char c2 = '\t';
		// 用unicode编码定义
		char c3 = '\u0009';
		// char的默认值
		char c4 = '\u0000';

		// 如何获取中文的unicode编码
		// 在cmd命令行中输入native2ascii
		// 结束转换进程 Ctrl + C

		char c5 = '\u5b59';
		char c6 = '\u6bc5';

		// char还能进行运算,与int类型互转
		// 数字字符不能直接运算,如果强转成int,结果不是本身,而是
		// 对应的ascii码,所以通过 字符 - '0'来得到本身.
		char c7 = '1';
		char c8 = '2';

		int __c7 = (int) c7;// 49
		int __c8 = (int) c8;// 50

		int _c7 = c7 - '0';// 1
		int _c8 = c8 - '0';// 2

		System.out.println("c1 = " + c1);
		System.out.println(c2 + "好好学习!");
		System.out.println(c3 + "好好学习!");
		System.out.println(c4);
		System.out.print(c5);
		System.out.println(c6);
		System.out.println(_c7);
		System.out.println(_c8);

		// 布尔类型
		boolean bool = false;
		System.out.println(bool);

		// 定义常量:常量都采用大写字母,并且用_隔开
		final int ROW_EACH_PAGE = 10;
		// ROW_EACH_PAGE = 19;常量一旦声明,不能改变值
		System.out.println(ROW_EACH_PAGE);
	}
}
