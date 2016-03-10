package com.laozhang.corejava.day07;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("张三",2000);
		Employee e2 = new Employee("李四",3500);
		Employee e3 = new Employee("王五",5000);
		System.out.println(e1.getId());
		System.out.println(e2.getId());
		System.out.println(e3.getId());
	}

}
