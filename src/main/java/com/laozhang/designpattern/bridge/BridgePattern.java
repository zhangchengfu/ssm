package com.laozhang.designpattern.bridge;

public class BridgePattern {
	
	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementation();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		abstraction.operation();
		abstraction.operation();
	}
}
