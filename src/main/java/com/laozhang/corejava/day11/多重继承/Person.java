package com.laozhang.corejava.day11.多重继承;

/**
 * @描述 抽象父类
 * @日期 May 10, 2013 4:21:53 PM
 * @作者 JSD1304
 */
public abstract class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	// 抽象方法
	public abstract void run();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
