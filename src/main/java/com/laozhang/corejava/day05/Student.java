package com.laozhang.corejava.day05;

import java.util.Date;

/**学生实体类*/
public class Student {
	//属性
	private String name;
	private String gender;
	private Date birthday;//内置对象类型的属性
	private Clazz clazz;//班级,自定义对象类型的属性
	
	
	//构造方法
	public Student() {
		
	}
	
	public Student(String name, String gender, Date birthday) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
	}
	
	public Student(String name, String gender, Date birthday, Clazz clazz) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.clazz = clazz;
	}

	//存取方法
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
}
