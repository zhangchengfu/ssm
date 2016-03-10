package com.laozhang.corejava.day15.线程案例;

import com.laozhang.corejava.day15.线程案例.Table.Person;


public class 线程安全性问题 {
	public static void main(String[] args) {
		Table table = new Table();
		Person p1 = table.new Person();
		Person p2 = table.new Person();
		p1.start();
		p2.start();
	}
}

class Table {
	int beans = 20;
	static Object monitor = new Object();
	public int getBean() {
		synchronized(monitor) {
			if(beans == 0) {
				throw new RuntimeException("没有了！");
			}
		    Thread.yield();
			return beans--;
		}
	}
	public synchronized int getBean2() {
		if (beans == 0) {
			throw new RuntimeException("没有了!");
		}
		Thread.yield();
	    return beans--;
	}
	class Person extends Thread {
		public void run() {
			while(true){
				int bean = getBean();
			    System.out.println(getName()+ ":"+bean);
				Thread.yield();
			}
		}
	}
}

