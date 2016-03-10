package com.laozhang.corejava.day09.回调;

import java.util.Date;

/** 业务类 */
public class Server {
	//接口做为属性
	private TimePrinter printer;
	
	/**
	 * 注册回调对象
	 */
	public void setTimerPrinter(TimePrinter printer){
		this.printer = printer;
	}
	
	public void start(){
		for(int i = 0;;i++){
			Date d= new Date();
			printer.print(d);//回调
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
