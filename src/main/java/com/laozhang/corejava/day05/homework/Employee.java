package com.laozhang.corejava.day05.homework;

public class Employee {
	private String empno;// 员工编号
	private String name;// 员工姓名
	private double salary;// 员工工资

	private Employee manager;// 上司
	private Employee[] ordinates;// 下属

	public Employee() {

	}
	
	public Employee(String empno, String name, double salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	public Employee(String empno, String name, double salary, Employee manager,
			Employee[] ordinates) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.manager = manager;
		this.ordinates = ordinates;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Employee[] getOrdinates() {
		return ordinates;
	}

	public void setOrdinates(Employee[] ordinates) {
		this.ordinates = ordinates;
	}

	// 业务方法
	// 添加下属的方法
	public void addEmployee(Employee e) {
		if (this.ordinates != null) {// 说明此员工可以添加下属
			// 得到目前数组的容量
			int size = ordinates.length;
			Employee[] newEmps = new Employee[size + 1];
			System.arraycopy(ordinates, 0, newEmps, 0, size);
			newEmps[size] = e;
			ordinates = newEmps;
		} else {
			System.out.println("本员工无权添加下属.");
		}
	}

	// 输出自己所属下属的方法
	public void printOrdinates() {
		if (ordinates != null) {
			for (int i = 0; i < ordinates.length; i++) {
				System.out.printf("姓名:%s,工资:%f\n", ordinates[i].getName(),
						ordinates[i].getSalary());
			}
		}
	}

	// 获取自己下属的人数个数
	public int countOrdinates() {
		if (ordinates != null) {
			return ordinates.length;
		}
		return -1;// 说明,这个员工不是经理,所以,没有下属
	}
}
