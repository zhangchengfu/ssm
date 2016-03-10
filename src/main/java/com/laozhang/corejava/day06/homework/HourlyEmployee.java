package com.laozhang.corejava.day06.homework;

import java.util.Calendar;
import java.util.Date;

/******************
 * 小时工
 * 
 * @author yejf
 * 
 */
public class HourlyEmployee extends Employee {

	private double hour; // 每月工作的小时数
	private double pay_each_hour; // 每小时的工资

	public HourlyEmployee(String name, Date birthday, double hour,
			double pay_each_hour) {
		super(name, birthday);
		this.hour = hour;
		this.pay_each_hour = pay_each_hour;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public double getPay_each_hour() {
		return pay_each_hour;
	}

	public void setPay_each_hour(double pay_each_hour) {
		this.pay_each_hour = pay_each_hour;
	}

	// 业务方法
	@Override
	public double getSalary(int month) {
		// 如果员工的生日是本月的话,则额外奖励100元
		double bonus = 0;
		Calendar c = Calendar.getInstance();
		c.setTime(getBirthday()); // 设置日期
		if (c.get(Calendar.MONTH) + 1 == month) {
			bonus = 100;
		}
		// 如果超过160个小时,则超出的奖金是:
		if (hour > 160) {
			bonus += ((hour - 160) * 0.5 * pay_each_hour);
		}
		return bonus + hour * pay_each_hour;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "[" + hour + "," + pay_each_hour + "]";
	}
}
