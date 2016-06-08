package com.laozhang.designpattern.template;

public abstract class AbstractClass {
	public abstract void operate1();
	public abstract void operate2();
	public void templateMethod() {
		operate1();
		operate2();
	}
}
