package com.laozhang.corejava.day08.抽象类;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Circle("圆形", 3.0);
		// s.m();//静态会丢失多态性

		System.out.println(s);
		System.out.printf("%s的面积是:%-5.2f,周长是:%-5.2f.\n", s.getName(), s.area(),
				s.girth());
	}
}
