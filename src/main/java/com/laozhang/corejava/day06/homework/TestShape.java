package com.laozhang.corejava.day06.homework;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		Rect r = new Rect(3.5,4.0);
		Square s = new Square(5);
		Circle c = new Circle(6.0);
		
		//添加对象到数组中
		shape[0] = r;
		shape[1] = s;
		shape[2] = c;
		
		//循环输出
		for(Shape sh : shape){
			System.out.println("图形的周长为:" + sh.perimeter());
			System.out.println("图形的面积为:" + sh.area());
		}
	}
}
