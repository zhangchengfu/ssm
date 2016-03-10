package com.laozhang.corejava.day03;

import java.util.Calendar;

/**
 * 本类用来演示Switch Case
 */
public class SwitchCaseDemo1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//判断星期
		switch (day) {
		case 1:
			System.out.println("星期天");
			break;
		case 2:
			System.out.println("星期一");
			break;
		case 3:
			System.out.println("星期二");
			break;
		case 4:
			System.out.println("星期三");
			break;
		case 5:
			System.out.println("星期四");
			break;
		case 6:
			System.out.println("星期五");
			break;
		default:
			System.out.println("星期六");
		}
	}
}
