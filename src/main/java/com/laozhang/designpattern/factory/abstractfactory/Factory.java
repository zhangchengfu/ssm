package com.laozhang.designpattern.factory.abstractfactory;

public class Factory implements IFactory {

	public IProduct getProductA() {
		return new ProductA();
	}

	public IProduct getProductB() {
		return new ProductB();
	}

}
