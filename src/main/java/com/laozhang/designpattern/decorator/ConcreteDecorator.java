package com.laozhang.designpattern.decorator;
//具体装饰角色
public class ConcreteDecorator extends Decorator {

	
	public ConcreteDecorator(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		// 业务代码
	}
}
