package com.laozhang.corejava.day08.抽象类;

public class Circle extends Shape {

	private double radius;// 半径

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	//抽象方法必须重写
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double girth() {
		return 2 * Math.PI * radius;
	}
	
	//父类中的方法m()不会被重写(因为静态会丢失多态性)
	public static void m(){
		System.out.println("圆形的静态方法");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("[").append("半径:").append(radius).append("]");
		return builder.toString();
	}
}
