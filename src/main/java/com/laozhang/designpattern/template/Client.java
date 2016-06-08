package com.laozhang.designpattern.template;

public class Client {
	public static void main(String[] args) {
		AbstractClass clazz = new ConcreteClass();
		clazz.templateMethod();
	}
}
