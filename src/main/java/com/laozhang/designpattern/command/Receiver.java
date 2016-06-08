package com.laozhang.designpattern.command;
//接收者角色
public class Receiver {
	//真正执行命令相应的操作
	public void action() {
		System.out.println("执行操作");
	}
}
