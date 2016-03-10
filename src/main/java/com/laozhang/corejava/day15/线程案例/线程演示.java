package com.laozhang.corejava.day15.线程案例;

public class 线程演示 {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		Person2 p2 = new Person2();
		Person3 p3 = new Person3();
		p1.setDaemon(true);//设置p1为后台线程, 其他线程结束
		p1.setPriority(Thread.MIN_PRIORITY);//设置线程优先级为1
		p3.setPriority(Thread.MAX_PRIORITY);//设置线程优先级为10
		p1.start();
		p2.start();
		p3.start();
		System.out.println("Main Thread Over!");
	}
}

class Person1 extends Thread {
	public void run() {
		for(int i=0;i<10000;i++){
			System.out.println("做弹弓子打你家玻璃!");
			Thread.yield();
		}
		System.out.println("做弹弓 Over!");
	}
}
class Person2 extends Thread {
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("你是谁?");
			 Thread.yield();//正在执行的线让出当前处理器
		}
		System.out.println("你是谁 Over! ");
	}
}
class Person3 extends Thread {
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("修煤气的?");
			Thread.yield();
		}
		System.out.println("修煤气的 Over!");
	}
}
