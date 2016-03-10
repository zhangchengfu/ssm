package com.laozhang.corejava.day06.homework;

import java.util.Date;

/*************
 * 有底薪的销售人员
 * 
 * @author yejf
 * 
 */
public class BasedPlusSalesEmployee extends SalesEmployee {

	private double base; // 底薪

	public BasedPlusSalesEmployee(String name, Date birthday, double sales,
			double rate, double base) {
		super(name, birthday, sales, rate);
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month) + base;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "[" + base + "]";
	}
}
