package com.laozhang.corejava.day07;

/**
 * 产生唯一性ID的方法
 */
public class Employee {
	//属性
	private long id;
	
	//类变量
	private static long guid = 10000;
	
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.id = generateId();//生成ID
		this.name = name;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}
	
	//静态方法,负责产生唯一性ID
	public static long generateId(){
		return guid++;
	}
}
