package com.laozhang.corejava.day07.简单工厂;

/** 业务类*/
public class Computer {
	/**
	 * 本方法可以驱动所有的USB设备
	 * 只要是UsbDevice类型,都可以用本方法操作
	 */
	public void usbDriver(UsbDevice ub){
		System.out.println("开始驱动USB设备...");
		ub.tranfer();//回调(callback),利用多态
		System.out.println("驱动完成.");
	}
}
