package com.laozhang.corejava.day09.抽象类与接口;

/** 工厂类 */
public class SayHelloFactory3 implements IContants3{
	public static IHello3 getHello(int type){
		switch (type) {
		case SIM:
			return new SimpleHello3();
		case COM:
			return new ComplicatedHello3();
		default:
			System.out.println("参数不合法!");
		}
		return null;
	}
}
