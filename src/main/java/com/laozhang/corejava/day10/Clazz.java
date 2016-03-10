package com.laozhang.corejava.day10;

/**
 * @描述 班级实体类
 * @日期 May 9, 2013 10:55:35 AM
 * @作者 JSD1304
 */
public class Clazz {
	// 属性
	private String clazzName;// 班级名字
	private int capacity;// 容量

	public Clazz() {
		super();
	}

	public Clazz(String clazzName, int capacity) {
		super();
		this.clazzName = clazzName;
		this.capacity = capacity;
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[班级名称:").append(clazzName).append(",班级容量:").append(
				capacity).append("]");
		return builder.toString();
	}
}
