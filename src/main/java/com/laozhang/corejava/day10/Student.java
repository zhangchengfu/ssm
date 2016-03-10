package com.laozhang.corejava.day10;

import java.util.Date;

import com.laozhang.corejava.util.DateUtil;


/**
 * @描述 学生实体类
 * @日期 May 9, 2013 10:51:33 AM
 * @作者 JSD1304
 */
public class Student implements Cloneable{
	// 属性
	private int stuNo;// 学号
	private String name;// 姓名
	private String gender;// 性别
	private Date birthday;// 生日
	private Clazz clazz;// 班级

	// 构造
	public Student() {

	}

	public Student(int stuNo, String name, String gender, Date birthday) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
	}

	public Student(int stuNo, String name, String gender, Date birthday,
			Clazz clazz) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.clazz = clazz;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[学号:").append(stuNo).append(",姓名:").append(name)
				.append(",性别:").append(gender).append(",生日:").append(
						DateUtil.format(birthday, "yyyy-MM-dd")).append("]");
		if(clazz != null){
			builder.append(clazz.toString());
		}
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((clazz == null) ? 0 : clazz.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + stuNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Student other = (Student) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (clazz == null) {
			if (other.clazz != null)
				return false;
		} else if (!clazz.equals(other.clazz))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stuNo != other.stuNo)
			return false;
		return true;
	}
	
	//重写finalize()方法
	@Override
	protected void finalize() throws Throwable {
		System.out.println("--finalize");
		super.finalize();
	}
	
	/*
	//如果属性是i和j,则重写两个方法如下,可以当做面试时候的例子
	@Override
	public int hashCode() {
		
		return i * 31 + j;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		
		if(obj instanceof Student){
			Student s = (Student)obj;
		    return this.i == s.i && this.j == s.j; 
		}
		return false;
	}*/
	
	
	@Override
	//重写克隆方法,要把修饰符改成public
	//浅层复制
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	//深层复制
//	public Object clone() throws CloneNotSupportedException {
//		Student newStudent = new Student();
//		//设置属性
//		newStudent.setStuNo(100);
//		newStudent.setName(new String(name));
//		newStudent.setGender(gender);
//		newStudent.setBirthday((Date)birthday.clone());
//		//最好在Clazz重写clone()方法
//		Clazz c = new Clazz();
//		if(getClazz() != null){
//			c.setClazzName(getClazz().getClazzName());
//			c.setCapacity(getClazz().getCapacity());
//		}
//		newStudent.setClazz(c);
//		return newStudent;
//	}
}
