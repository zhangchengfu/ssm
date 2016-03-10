package com.laozhang.corejava.day15.线程;

/**
 * @描述 继承Thread类来实现多线程
 * @日期 May 16, 2013 2:32:19 PM
 * @作者 JSD1304
 */
public class PrintThread1 extends Thread{
	
	public PrintThread1(String name) {
		//调用父类带名字的构造
		super(name);
	}
	
	//重写run()方法
	@Override
	public void run() {
		for(int i = 0;i < 5;i++){
			//getName()可以返回该线程的名称
			System.out.printf("[%s]输出了:HelloWorld!\n",getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
