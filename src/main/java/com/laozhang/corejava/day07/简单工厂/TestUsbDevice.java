package com.laozhang.corejava.day07.简单工厂;

//静态导入
import static com.laozhang.corejava.day07.简单工厂.UsbFactory.*;

/**测试类*/
public class TestUsbDevice {
	public static void main(String[] args) {
		//1.尽可能在客户端中不要出现具体子类的实例
		//2.添加具体的子类,不影响客户端
		
		//没有工厂
		/*UsbDevice mouse = new UsbMouse();
		UsbDevice keyBoard = new UsbKeyBoard();
		mouse.tranfer();
		keyBoard.tranfer();*/
		
		//有工厂
		//此写法可读性不高,所以在工厂中应该定义常量
//		UsbDevice mouse = UsbFactory.createUsbDevice(1);
//		mouse.tranfer();
//		UsbDevice keyBoard = UsbFactory.createUsbDevice(2);
//		keyBoard.tranfer();
		UsbDevice mouse = UsbFactory.createUsbDevice(MOUSE);
		UsbDevice keyBoard = UsbFactory.createUsbDevice(KEYBOARD);
		
//		mouse.tranfer();
//		keyBoard.tranfer();
		
		//创建一个业务对象
		Computer c = new Computer();
		c.usbDriver(mouse);
		c.usbDriver(keyBoard);
		
	}
}
