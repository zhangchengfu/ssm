package com.laozhang.designpattern.visitor;

public class ConcreteVisitorA implements Visitor {

	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName());
		System.out.println(this.getClass().getSimpleName());
	}

	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName());
		System.out.println(this.getClass().getSimpleName());
	}

}
