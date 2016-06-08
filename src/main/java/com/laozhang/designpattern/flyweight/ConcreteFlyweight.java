package com.laozhang.designpattern.flyweight;

public class ConcreteFlyweight extends Flyweight {

	private String name;
	
	public ConcreteFlyweight(String name) {
		this.name = name;
	}
	
	@Override
	public void operation() {
		System.out.println("Concrete---Flyweight:" + name);
	}

}
