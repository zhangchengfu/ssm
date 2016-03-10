package com.laozhang.corejava.day08.抽象类;

/** 形狀抽象类 */
public abstract class Shape {
	// 属性
	private String name;// 形状的名称

	// 构造方法
	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 静态方法
	public static void m() {
		System.out.println("形状类的静态方法");
	}

	// 定义抽象方法
	public abstract double girth();

	public abstract double area();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[形状:").append(name).append("]");
		return builder.toString();
	}
}
