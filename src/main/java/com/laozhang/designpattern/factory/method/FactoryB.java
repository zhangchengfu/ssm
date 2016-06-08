package com.laozhang.designpattern.factory.method;

public class FactoryB implements IFactory {

	public IProduct getProduct() {
		return new ProductB();
	}

}
