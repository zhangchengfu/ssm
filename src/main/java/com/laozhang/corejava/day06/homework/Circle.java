package com.laozhang.corejava.day06.homework;

public class Circle extends Shape{
	//属性
	private double radius;//半径
	
	public Circle() {
		
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "圆形的面积:" + area() + "\n" + "圆形的周长:" + perimeter() + "\n";
	}
}
