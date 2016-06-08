package com.laozhang.designpattern.factory.simple;

public class CaseA implements ICase {
	private int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public CaseA(int a) {
		super();
		this.a = a;
	}
	
}
