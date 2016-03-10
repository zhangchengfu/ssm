package com.laozhang.corejava.day06.homework;

import java.util.Date;


public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emps = new Employee[4];
		SalariedEmployee se = new SalariedEmployee("李雷", new Date(), 2850.0);
		HourlyEmployee he = new HourlyEmployee("韩妹妹", new Date(), 180, 15);
		SalesEmployee sales = new SalesEmployee("张三", new Date(), 250000, 0.035);
		BasedPlusSalesEmployee bse = new BasedPlusSalesEmployee("李四",
				new Date(), 17000, 0.02, 3000);
		emps[0] = se;
		emps[1] = he;
		emps[2] = sales;
		emps[3] = bse;

		// 打印输出
		for (Employee e : emps) {
			System.out.println(e);
			System.out.println(e.getName() + " 5月份工资是:" + e.getSalary(5));
		}
	}
}
