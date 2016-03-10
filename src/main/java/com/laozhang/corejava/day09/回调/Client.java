package com.laozhang.corejava.day09.回调;

/**客户端*/
public class Client {
	public static void main(String[] args) {
		//创建Server对象
		Server s = new Server();
		//通过工厂获取接口的实例
		TimePrinter printer = TimePrinterFactory.newTimePrinter(IContants.SIM);
		//注册回调接口对象
		s.setTimerPrinter(printer);
		s.start();
	}
}
