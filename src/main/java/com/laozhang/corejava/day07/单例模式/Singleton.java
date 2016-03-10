package com.laozhang.corejava.day07.单例模式;

/**
 * 本类用来演示单例模式
 * 目的:保证某一个类的实例在一个系统中永远只有一个
 */
public class Singleton {
	//饿汉模式
	//1.私有化静态属性,并且直接初始化
//	private static Singleton instance = new Singleton();
//	
//	//2.构造方法私有化
//	private Singleton() {
//		
//	}
//	
//	//3.公开静态方法,返回本类的唯一实例
//	public static Singleton getInstance(){
//		return instance;
//	}
	
	
//	//懒汉模式
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public synchronized static  Singleton getInstance() throws InterruptedException{
		if(instance == null){
			Thread.sleep(10);
			instance = new Singleton();
		}
		return instance;
		//return instance == null ? instance = new Singleton():instance;
	}
	
}
