package com.laozhang.corejava.day15.线程案例;

public class 线程的休眠1 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("hello");
					Thread.yield();
				}
				System.out.println("~t1结束~");
			}
		};
		t1.start();
		System.out.println("开始休眠");
		Thread.sleep(1000*5);
		System.out.println("结束休眠");
	}
}
