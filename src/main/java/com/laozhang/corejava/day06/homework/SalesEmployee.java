package com.laozhang.corejava.day06.homework;

import java.util.Calendar;
import java.util.Date;

/****************
 * 销售人员
 * 
 * @author yejf
 * 
 */
public class SalesEmployee extends Employee {

	private double sales; // 月销售额
	private double rate; // 提成率

	public SalesEmployee(String name, Date birthday, double sales, double rate) {
		super(name, birthday);
		this.sales = sales;
		this.rate = rate;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		// 如果员工的生日是本月的话,则额外奖励100元
		double bonus = 0;
		Calendar c = Calendar.getInstance();
		c.setTime(getBirthday()); // 设置日期
		if (c.get(Calendar.MONTH) + 1 == month) {
			bonus = 100;
		}
		return bonus + (rate * sales);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "[" + sales + "," + rate + "]";
	}
}
