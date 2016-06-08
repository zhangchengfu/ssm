package com.laozhang.designpattern.singleton;

public class Singleton {
	private static Singleton singleton;
	private Singleton() {
		
	}
	public static synchronized Singleton newInstance() {
		if (null == singleton) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
/**
 * 单例模式:1,饿汉模式	2, 懒汉模式
 * 
 * 1,私有静态属性	singleton	
 * 		饿汉模式：实例化
 * 2，私有构造方法
 * 
 * 3，公开静态方法，返回唯一实例
 * 
 * 
 */
