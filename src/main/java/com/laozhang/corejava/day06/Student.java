package com.laozhang.corejava.day06;

public class Student {
	// 属性
	private String name;
	private String gender;

	public Student() {

	}

	public Student(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// 重写toString()方法
	@Override
	public String toString() {
		return "姓名:" + name + ",性别:" + gender;
	}
}
