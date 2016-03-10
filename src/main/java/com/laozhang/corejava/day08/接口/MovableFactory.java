package com.laozhang.corejava.day08.接口;

/** 交通工具工厂类 */
public class MovableFactory implements IContant{
	//常量
//	public static final int CAR = 1;
//	public static final int PLANE = 2;
	
	public static Movable createMovable(int type){
		switch (type) {
		case CAR:
			return new Car();
		case PLANE:
			return new Plane();
		default:
			System.err.println("参数不合法!");
			return null;
		}
	}
}
