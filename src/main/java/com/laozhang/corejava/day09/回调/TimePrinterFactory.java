package com.laozhang.corejava.day09.回调;

/**
 * 时间打印工厂 
 * 产生具体的实现类的实例
 */
public class TimePrinterFactory implements IContants{
	
	public static TimePrinter newTimePrinter(int type){
		if(type == SIM){
			return new SimpleTimePrinter();
		}else if(type == COM){
			return new ComplicatedTimePrinter();
		}else{
			System.out.println("参数不合法!");
		}
		return null;
	}
}
