package com.laozhang.corejava.reflect;

public class Point {
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void print1() {
		System.out.println("你好!");
	}

	public void print2(String name, int i) {
		System.out.println("111张三你好!");
	}

	private void print3() {
		System.out.println("私有方法!");
	}

	@Override
	public String toString() {
		return "X=" + x + " , " + "Y=" + y;
	}
}
