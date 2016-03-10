package com.laozhang.corejava.day06.homework;

public class Rect extends Shape {
	// 属性
	private double length;// 长
	private double width;// 宽

	// 构造
	public Rect() {

	}

	public Rect(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double perimeter() {
		return (length + width) * 2;
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public String toString() {
		return "长方形的面积:" + area() + "\n" + "长方形的周长:" + perimeter() + "\n";
	}
	
}
