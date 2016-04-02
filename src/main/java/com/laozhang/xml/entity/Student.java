package com.laozhang.xml.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @描述 学生实体类
 * @日期 May 21, 2013 2:23:47 PM
 * @作者 JSD1304
 */
public class Student {
	private Integer id;
	private String name;
	private String no;
	private Date birthday;
	private Address addr;

	public Student() {

	}

	public Student(Integer id, String name, String no, Date birthday) {
		this.id = id;
		this.name = name;
		this.no = no;
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		builder.append("学号:id=").append(id).append(",姓名=").append(name)
				.append(",学号=").append(no).append(",生日=").append(
						sdf.format(birthday));
		if (addr != null) {
			builder.append("\t地址:").append(addr);
		}
		return builder.toString();

	}

}
