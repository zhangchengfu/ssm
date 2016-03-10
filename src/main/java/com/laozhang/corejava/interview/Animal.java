package com.laozhang.corejava.interview;

public class Animal {
	private String desc;

	public Animal() {
		this.desc = getDesc();
	}

	public String getDesc() {
		return "Animal";
	}

	public String toString() {
		return desc;
		//return getDesc();
	}

}
