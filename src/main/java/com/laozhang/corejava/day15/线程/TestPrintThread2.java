package com.laozhang.corejava.day15.线程;

/**
 * @描述 测试类
 * @日期 May 16, 2013 2:52:45 PM
 * @作者 JSD1304
 */
public class TestPrintThread2 {
	public static void main(String[] args) {
		Runnable r = new PrintThread2();
		Thread t = new Thread(r);
		t.start();
	}
}
