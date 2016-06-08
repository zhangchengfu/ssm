package com.laozhang.designpattern.build;

public class ConcreteBuilder extends Builder {
	
	private Product product = new Product();

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub

	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
