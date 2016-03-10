package com.laozhang.corejava.day15.线程案例;

public class 线程的休眠3 {
	public static void main(String[] args) {
		final Thread t1 = new Thread(){
			public void run(){
				try {
					for(int i=0;i<=10;i++){
					    System.out.println("睡觉。。。");
					    Thread.sleep(1000);
					}
					System.out.println("睡醒了,相安无事!");
				} catch (InterruptedException e) {
						e.printStackTrace();
						System.out.println("干嘛呐!干嘛呐!你妹啊!!!");
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				try{
					for(int i=0;i<8;i++){
						System.out.println("砸墙！");
						Thread.sleep(1000);
					}
					System.out.println("砸开了！");
					t1.interrupt();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t2.start();
	}
}
