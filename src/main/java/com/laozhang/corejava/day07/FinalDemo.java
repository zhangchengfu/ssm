package com.laozhang.corejava.day07;

/**
 * 本类用来掩饰final的用法
 */
public class FinalDemo {
	//修饰属性
	public static final int SPRING= 1;
	public static final int SUMMER = 2;
	
	public static final int AUTUMN;
	public static final int WINTER = 4;
	
	//静态代码块
	static{
		AUTUMN = 3;
	}
	
	//构造方法
//	public FinalDemo() {
//		//AUTUMN = 5;常量不能改变
//		
//	}
	
	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		
		//获取对象运行时类型的方法
		//方式一:
		Class c1 = FinalDemo.class;
		
		//方式二:getClass()方法是Object的
		Class c2 = fd.getClass();
		
		System.out.println(c1 == c2);
		System.out.println(c1);
		System.out.println(c2);
	}
}
