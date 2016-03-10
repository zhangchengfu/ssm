package com.laozhang.corejava.day06.homework;

import java.util.Calendar;
import java.util.Date;

public class SalariedEmployee extends Employee {

	private double salary; // 月薪

	public SalariedEmployee(String name, Date birthday, double salary) {
		super(name, birthday);
		this.salary = salary;
	}

	@Override
	public double getSalary(int month) {
		// 如果员工的生日是本月的话,则额外奖励100元
		Calendar c = Calendar.getInstance();
		c.setTime(getBirthday()); // 设置日期
		if (c.get(Calendar.MONTH) + 1 == month) {
			return salary + 100;
		} else {
			return this.salary;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "[" + salary + "]";
	}
}
