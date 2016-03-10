package com.laozhang.corejava.day04;

import java.util.Random;//方式二需要导包

/**
 * 本类用来演示JAVA产生随机数的两种方式 
 * 1.Math.random(); 
 * 2.Random rd = new Random();
 *   rd.nextInt();...
 */
public class RandomDemo {
	public static void main(String[] args) {
		//method1();
		method2();
	}

	// 方式一:Math.random(),范围[0,1)
	public static void method1() {
		for (int i = 0; i < 10; i++) {
			double d = Math.random();
			// 改变范围
			int in = (int) (Math.random() * 35 + 1);
			System.out.println(in);
		}
	}
	
	//方式二:创建Random对象,然后调用相应方法
	public static void method2(){
		Random rd = new Random();
		for (int i = 0; i < 10; i++) {
			int in = rd.nextInt();//得到int范围内的随机数
			//改变范围
			int in2 = rd.nextInt(35);//产生[0,指定值)
			System.out.println(in2);
		}
	}
}
