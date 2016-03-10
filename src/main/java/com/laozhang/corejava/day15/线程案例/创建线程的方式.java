package com.laozhang.corejava.day15.线程案例;

public class 创建线程的方式 {
	public static void main(String[] args) {
		//使用Runnable接口的实例创建线程
		class Runner implements Runnable{
			public void run() {
				System.out.println("Runner");
			}
		}
		Thread t1 = new Thread(new Runner());
		t1.start();
		
		Thread t2 = new Thread(new Runner(){
		    public void run(){
		    	System.out.println("t2 Running");
		    }
		});
		t2.start();
		
		Thread t3 = new Thread(){
			public void run(){
				System.out.println("t3 Running");
			}
		};
		t3.start();
		
		new Thread(){
			public void run(){
				System.out.println("没有名字的线程!");
			}
		}.start();
	}
}
