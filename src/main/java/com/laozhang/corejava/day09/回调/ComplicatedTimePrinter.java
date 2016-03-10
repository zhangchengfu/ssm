package com.laozhang.corejava.day09.回调;

import java.util.Date;

/** 复杂时间 */
public class ComplicatedTimePrinter implements TimePrinter{
	public void print(Date date) {
		System.out.println(date);
	}
}
