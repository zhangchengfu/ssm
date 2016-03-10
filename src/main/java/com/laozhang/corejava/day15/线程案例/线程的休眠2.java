package com.laozhang.corejava.day15.线程案例;

public class 线程的休眠2 {
	public static void main(String[] args) {
		final Thread guy = new Thread(){
			public void run(){
				try {
					System.out.println("~开始睡觉~");
					Thread.sleep(1000*20);
					System.out.println("正常醒来");
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("提前被唤醒!");
				}
			}
		};
		Thread timer = new Thread(){
			public void run(){
				System.out.println("启动定时器");
				try{
					Thread.sleep(1000*10);
					System.out.println("定时器休眠10秒结束！");
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("打断唤醒guy");
				guy.interrupt();
			}
		};
		timer.start();
		guy.start();
	}
}
