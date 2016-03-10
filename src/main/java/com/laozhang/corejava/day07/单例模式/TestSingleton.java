package com.laozhang.corejava.day07.单例模式;

/**
 * 单例模式测试类
 */
public class TestSingleton {
	public static void main(String[] args) {
		//Singleton s1 = new Singleton();由于构造私有,不能这么创建
		/*Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);*/
		
		//注:只要是用new操作符来获取对象的,是绝不可能相等的
		//因为==直接比较内存地址
		
			new Thread(new Runnable() {
				
				public void run() {
					Singleton s;
					try {
						s = Singleton.getInstance();
						System.out.println(s);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			
			}).start(); 
			
			new Thread(new Runnable() {
				
				public void run() {
					Singleton s;
					try {
						s = Singleton.getInstance();
						System.out.println(s);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			
			}).start();
		
	}
}
