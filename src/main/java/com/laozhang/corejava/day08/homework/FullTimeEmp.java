package com.laozhang.corejava.day08.homework;



public class FullTimeEmp extends Emp {
	public static final double BASE_SALARY = 3000;
	private double work ;//任务完成度
	


	public FullTimeEmp( double work) {
		super();
		this.work = work;
	}



	public double getWork() {
		return work;
	}



	public void setWork(double work) {
		this.work = work;
	}



	@Override
	public double calcSalary() {   //#父类的方法没有参数,那子类也没有,不管是不是抽象方法
		double s = 0;
		if(work>=1.0 && work<1.3){
			s = BASE_SALARY * 1.1;
		}else if(work>=1.3 && work <1.5){
			s = BASE_SALARY + BASE_SALARY* 0.1 * 1.5;
			return s;
		}else if(work>=1.5 && work <1.8){
			s = BASE_SALARY + BASE_SALARY * 0.1 *2;
			return s;
		}else if(work >= 1.8){
			s = BASE_SALARY + BASE_SALARY * 0.1 * 3;
			
		}
		return s;
	}
	

	
}
