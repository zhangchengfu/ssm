package com.laozhang.corejava.day08.接口;

/** 交通工具子类--汽车类 */
public class Car extends Vehicle implements CheekSpeed{

	public void move(int direction) {
		System.out.printf("汽车正在以[%d]码的速度向[%s]行驶.\n", getSpeed(),
				getDirectionDesc(direction));
	}

	public int getSpeed() {
		return 301;
	}
}
