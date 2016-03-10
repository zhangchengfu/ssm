package com.laozhang.corejava.day08.homework;

public class EmployeeTest {
	public static void main(String[] args) {
		Emp b = new Boss();
//		b.calcSalary();
		System.out.printf("老板的月薪是%-7.1f",b.calcSalary());
		Emp h = new HourEmp(180);
//		h.calcSalary();
		System.out.printf("\n小时工的月薪是%-7.1f",h.calcSalary());
		Emp f = new FullTimeEmp(1.7);
//		f.calcSalary();
		System.out.printf("\n全职工的月薪是%-7.1f",f.calcSalary());
		
	}
}
