package com.laozhang.designpattern.visitor;

public class ConcreteElementA implements Element {

	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

}
