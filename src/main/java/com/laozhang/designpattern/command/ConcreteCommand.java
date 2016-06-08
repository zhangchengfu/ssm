package com.laozhang.designpattern.command;

public class ConcreteCommand implements Command {

	//持有相应的接收者对象
	private Receiver receiver = null;
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void excute() {
		// 通常会转调接收者对象的相应方法，让接收者真正执行功能
		receiver.action();
	}

}
