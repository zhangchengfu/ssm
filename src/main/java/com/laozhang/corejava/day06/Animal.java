package com.laozhang.corejava.day06;

/** 动物实体类 父类 */
public class Animal {
	// 共性的成员都写在父类中

	// 属性
	private String type;
	private String name;
	private String color;

	// 构造
	public Animal() {
		System.out.println("--父类空参构造");
	}

	public Animal(String type, String name, String color) {
		super();
		this.type = type;
		this.name = name;
		this.color = color;
		System.out.println("--父类有参构造");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 普通方法
	public void eat() {
		System.out.println("动物吃的方法");
	}

	public void spark() {
		System.out.println("动物叫的方法");
	}

}
