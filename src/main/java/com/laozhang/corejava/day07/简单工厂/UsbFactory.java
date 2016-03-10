package com.laozhang.corejava.day07.简单工厂;

/**简单工厂类*/
public class UsbFactory {
	//定义常量
	public static final int MOUSE = 1;
	public static final int KEYBOARD = 2;
	
	/**
	 * 提供公开静态方法,返回父类类型的对象
	 */
	public static UsbDevice createUsbDevice(int type){
		if(type == MOUSE){
			return new UsbMouse();
		}else if(type == KEYBOARD){
			return new UsbKeyBoard();
		}else{
			System.out.println("参数不合法!");
		}
		return null;
	}
}
		
//		switch (type) {
//		case MOUSE:
//			new UsbMouse();
//			break;
//		case KEYBOARD:
//			new UsbKeyBoard();
//			break;
//		default:
//			System.out.println("参数不合法!");
//			break;
//		}

