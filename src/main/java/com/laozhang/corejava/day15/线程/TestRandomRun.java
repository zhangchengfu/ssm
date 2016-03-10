package com.laozhang.corejava.day15.线程;

/**
 * @日期 May 16, 2013 3:00:15 PM
 * @作者 JSD1304
 */
public class TestRandomRun {
	public static void main(String[] args) {
//		RandomRun1 rr = new RandomRun1(100);
//		Thread t1 = new Thread(rr);
//		t1.start();
//		Thread t2 = new Thread(rr);
//		t2.start();
//		Thread t3 = new Thread(rr);
//		t3.start();
		
		//创建锁对象
		Object lock = new Object();
		//创建三条线程并且执行
		RandomRun2 r1 = new RandomRun2(100,lock);
		Thread t1 = new Thread(r1);
		t1.start();
		RandomRun2 r2 = new RandomRun2(100,lock);
		Thread t2 = new Thread(r2);
		t2.start();
		RandomRun2 r3 = new RandomRun2(100,lock);
		Thread t3 = new Thread(r3);
		t3.start();
	}
}
