package com.laozhang.corejava.day07.简单工厂;

/**USB鼠标类*/
public class UsbMouse extends UsbDevice{
	@Override
	public void tranfer() {
		System.out.println("鼠标连接中...");
		System.out.println("连接完成!");
		System.out.println("鼠标可以正常使用了~");
	}
}
