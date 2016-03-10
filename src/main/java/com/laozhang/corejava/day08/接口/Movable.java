package com.laozhang.corejava.day08.接口;

/** 接口 */
public interface Movable {
	//属性
	int EAST = 1;//相当于public static final int EAST = 1;
	int WEST = 2;
	int NORTH = 3;
	int SOUTH = 4;
	
	//方法
	void move(int direction);
	//相当于public abstract void move(int direction);
	
	int getSpeed();
}
