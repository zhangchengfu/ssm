package com.laozhang.corejava.day10;

/**
 * @描述 Java中获取Class实例的三种方式
 * @日期 May 9, 2013 10:07:10 AM
 * @作者 JSD1304
 */
public class ClassDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//方式一:通过getClass()方法
		Book b = new Book();
		Class c1 = b.getClass();
		
		//方式二:通过类.class属性来获取
		Class c2 = Book.class;
		
		//方式三:通过调用Class.forName("类的全限定名");来获取
		Class c3 = Class.forName("com.corejava.day10.Book");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
