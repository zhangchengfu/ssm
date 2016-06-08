package com.laozhang.designpattern.visitor;

public class ConcreteElementB implements Element {

	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

}
