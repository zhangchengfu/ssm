package com.laozhang.corejava.day06.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

/*******************************************************************************
 * 员工类
 * 
 * @author yejf
 * 
 */
public class Employee {

	private String name; // 员工姓名
	private Date birthday; // 员工生日

	public Employee() {
		super();
	}

	public Employee(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	// 业务方法
	public double getSalary(int month) {
		return 0.0;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		StringBuilder builder = new StringBuilder();
		builder.append("[").append(name).append(",").append(
				sdf.format(birthday)).append("]");
		return builder.toString();
	}
}
