package com.laozhang.corejava.day15.线程;

/**
 * @描述 实现Runnable接口创建线程
 * @日期 May 16, 2013 2:49:31 PM
 * @作者 JSD1304
 */
public class PrintThread2 implements Runnable{
	public void run() {
		for(int i = 0;i < 5;i++){
			System.out.println("线程执行中...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
