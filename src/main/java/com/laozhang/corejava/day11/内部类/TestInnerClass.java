package com.laozhang.corejava.day11.内部类;

import com.laozhang.corejava.day11.内部类.Outer.StaticInner;


/**
 * @描述 测试内部类
 * @日期 May 10, 2013 3:56:21 PM
 * @作者 JSD1304
 */
public class TestInnerClass {
	public static void main(String[] args) {
		//1.测试成员内部类
		Outer outer = new Outer();//创建外部类对象
		
		//非私有化成员内部类时的创建对象以及调用
		//Outer.MemberInner mInn = outer.new MemberInner();//创建方式一
		//Outer.MemberInner mInn = new Outer().new MemberInner();//创建方式二
		//mInn.printDatas();
		
		//私有化成员内部类时的创建对象以及调用
		outer.print();
		
		System.out.println("------------------------------------");
		
		//2.测试静态内部类,由于是静态的,所以不属于对象,可以直接用外部类去调用
		//Outer.StaticInner staticInner = new Outer.StaticInner();//方式一
		
		//方式二,上升为顶级类
		StaticInner staticInner = new StaticInner();
		//调用方法
		long id = staticInner.generated();
		System.out.println("id = " + id);
		
		System.out.println("------------------------------------");
		
		//3.测试局部内部类
		outer.output(3);
		
		System.out.println("------------------------------------");
		
		//4.测试匿名内部类
		outer.output();
	}
}
