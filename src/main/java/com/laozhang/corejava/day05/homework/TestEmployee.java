package com.laozhang.corejava.day05.homework;

public class TestEmployee {
	public static void main(String[] args) {
		//创建一个普通员工
		Employee e1 = new Employee("1001","张三",5677.2);
		Employee e2 = new Employee("1002","李四",4545.5);
		
		//创建一个可以添加下属的员工
		Employee m1 = new Employee("10","经理1",15490.0);
		m1.setOrdinates(new Employee[0]);
		//添加下属
		m1.addEmployee(e1);
		m1.addEmployee(e2);
		
		System.out.println("经理:" + m1.getName() + "的下属个数是:" + m1.countOrdinates());
		
		//输出
		m1.printOrdinates();
	}
}
