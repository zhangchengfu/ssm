package com.laozhang.corejava.day15.线程;

/**
 * @描述 打印随机数的线程(外同步方式)
 * @日期 May 16, 2013 2:55:36 PM
 * @作者 JSD1304
 */
public class RandomRun2 implements Runnable{
	private int base;//随机数的上限
	private Object lock;//锁
	
	public RandomRun2(int base,Object lock) {
		this.base = base;
		this.lock = lock;
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	public Object getLock() {
		return lock;
	}

	public void setLock(Object lock) {
		this.lock = lock;
	}

	//外同步
	public void run() {
		synchronized (lock) {
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
}
