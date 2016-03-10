package com.laozhang.corejava.day07.简单工厂;

/**USB键盘类*/
public class UsbKeyBoard extends UsbDevice{
	@Override
	public void tranfer() {
		System.out.println("键盘连接中...");
		System.out.println("连接完成!");
		System.out.println("键盘可以正常使用了~");
	}
}
