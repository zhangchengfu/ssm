package com.laozhang.corejava.day09.回调;

import java.util.Date;

import com.laozhang.corejava.util.DateUtil;


/** 简单时间打印 */
public class SimpleTimePrinter implements TimePrinter {

	public void print(Date date) {
		String str = DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		System.out.println("简单时间打印结果:" + str);
	}
}
