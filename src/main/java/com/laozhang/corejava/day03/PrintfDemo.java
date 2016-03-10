package com.laozhang.corejava.day03;

/**
 * 本类用来演示格式化输出
 */
public class PrintfDemo {
	public static void main(String[] args) {
		String name = "高富帅";
		String brand = "兰博基尼";
		int speed = 375;
		String dest = "西";
		//普通输出语句
		System.out.println(name + "驾驶着" + brand + "正在以时速" + speed + "KM/H的速度向"
				+ dest + "行驶!");
		
		//格式化输出
		//1.占位符根据变量类型决定,2.变量顺序不能随意
		System.out.printf("%s驾驶着%s正在以时速%dKM/H的速度向%s行驶!\n",name,brand,speed,dest);
	
		//格式化输出的拓展
		double d = 3.1415926;
		//10代表变量所占的宽度,默认是右对齐,左对齐在前面加负号
		//控制小数的精度(.数值),精度必须与宽度配合使用
		System.out.printf("圆周率是%-30.2f",d);
	}
}
