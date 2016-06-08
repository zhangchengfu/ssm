package com.laozhang.designpattern.factory.method;

public class FactoryA implements IFactory {

	public IProduct getProduct() {
		return new ProductA();
	}

}
