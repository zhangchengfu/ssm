package com.laozhang.designpattern.decorator;
//装饰角色
public class Decorator implements Component {
	
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}

	public void operation() {
		// 委派给构件
		component.operation();
	}

}
