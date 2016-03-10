package com.laozhang.corejava.day05.homework;

public class TestComputer {

	public static void main(String[] args) {
		Computer c = new Computer("联想", 7856.85, "I7/500G/7200转/4G内存/独显");
		c.outputComputerInfo();
		// 创建一个Screen对象
		Screen screen = new Screen("LED", 19, "ViewSonic");
		// 把screen对象注册到 computer之中
		c.setScreen(screen);
		c.outputComputerInfo();

	}
}
