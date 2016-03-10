package com.laozhang.corejava.day05;

/**
 * 杯子实体类
 * 本类用来演示this关键字
 */
public class Cup {
	//属性
	private String color;
	private String cap;
	private String type;
	
	public Cup() {
		
	}

	public Cup(String cap, String type) {
		this.cap = cap;//this指代当前对象
		this.type = type;
	}

	public Cup(String color) {
		this("30L","玻璃");//调用另一个构造方法
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
