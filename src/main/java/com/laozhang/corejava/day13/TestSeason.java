package com.laozhang.corejava.day13;

/**
 * @描述 季节枚举的测试类
 * @日期 May 14, 2013 2:29:37 PM
 * @作者 JSD1304
 */
public class TestSeason {
	public static void main(String[] args) {
		Season currentS = Season.SUMMER;
		while(true){
			System.out.printf("现在是:[%s]\n",currentS);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			currentS = currentS.next();
		}
	}
}
