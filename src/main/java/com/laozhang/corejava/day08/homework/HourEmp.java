package com.laozhang.corejava.day08.homework;

public class HourEmp extends Emp {

	public static final double PAY_FOR_HOUR = 15;
	private int workHour;//工作小时数
	
	


	public HourEmp(int workHour) {
		super();
		this.workHour = workHour;
	}



	public int getWorkHour() {
		return workHour;
	}



	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}



	@Override
	public double calcSalary() {        //#父类的方法没有参数,那子类也没有,不管是不是抽象方法
		return workHour * PAY_FOR_HOUR;
	}

}
