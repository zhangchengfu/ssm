package com.laozhang.corejava.day08.接口;

/** 交通工具子类--飞机类 */
public class Plane extends Vehicle{
	
	public int getSpeed() {
		return 480;
	}
	public void move(int direction) {
		System.out.printf("飞机正在以[%d]码的速度向[%s]飞行.\n", getSpeed(),
				getDirectionDesc(direction));
	}
}
