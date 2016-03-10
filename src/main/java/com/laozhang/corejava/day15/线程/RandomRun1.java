package com.laozhang.corejava.day15.线程;

/**
 * @描述 打印随机数的线程(内同步方式)
 * @日期 May 16, 2013 2:55:36 PM
 * @作者 JSD1304
 */
public class RandomRun1 implements Runnable{
	private int base;//随机数的上限
	
	public RandomRun1(int base) {
		this.base = base;
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	//内同步
	public synchronized void run() {
		System.out.printf("[%s]产生如下随机数:\n\t", Thread.currentThread().getName());
		for(int i = 0;i < 7;i++){
			int r = (int)(Math.random() * base) + 1;
			//打印
			System.out.printf("%5d",r);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
