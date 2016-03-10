package com.laozhang.corejava.day04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 本类用来演示日期处理
 */
public class DateAPIDemo {
	public static void main(String[] args) {
		//创建Calendar对象
		Calendar cal = Calendar.getInstance();
		//通过set方法来设置日历
		cal.set(Calendar.YEAR, 2012);
		cal.set(Calendar.MONTH, 11);//MONTH从0开始
		cal.set(Calendar.DAY_OF_MONTH, 23);
		//通过getTime()方法获取Date类型的时间
		Date d = cal.getTime();
		//因为Date中已经重写了toString(),所以打印不会出现内存地址
		System.out.println(d);
		
		//格式化Date类型
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		//格式化完成后是字符串
		System.out.println(s);
	}
}
