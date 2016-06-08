package com.laozhang.designpattern.visitor;

public interface Element {
	public abstract void accept(Visitor visitor);
}
