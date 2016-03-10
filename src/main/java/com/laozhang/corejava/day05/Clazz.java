package com.laozhang.corejava.day05;

/** 班级的实体类 */
public class Clazz {
	private String clazzName;
	private int cap;//容量
	
	public Clazz() {
		
	}
	public Clazz(String clazzName, int cap) {
		this.clazzName = clazzName;
		this.cap = cap;
	}
	public String getClazzName() {
		return clazzName;
	}
	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
}
