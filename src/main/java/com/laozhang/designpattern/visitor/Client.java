package com.laozhang.designpattern.visitor;

public class Client {
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());
		
		ConcreteVisitorA v1 = new ConcreteVisitorA();
		ConcreteVisitorB v2 = new ConcreteVisitorB();
		
		o.accept(v1);
		o.accept(v2);
	}
}
