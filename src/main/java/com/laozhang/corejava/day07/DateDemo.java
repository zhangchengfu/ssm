package com.laozhang.corejava.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 本类用来演示Java时间日期处理及转换
 */
public class DateDemo {
	public static void main(String[] args) throws ParseException {
		//如果得到2000年8月8号,08:08:00
		//方式一:采用Calendar类
		Calendar cal = Calendar.getInstance();
		//分别设置年月日,时分秒到此日历中
		cal.set(Calendar.YEAR, 2000);
		cal.set(Calendar.MONTH, 7);//7代表8月,0~11
		cal.set(Calendar.DAY_OF_MONTH, 8);
		cal.set(Calendar.HOUR_OF_DAY, 8);
		//再通过getTime()方法获得Date对象
		Date d = cal.getTime();
		//输出结果:Date中已经重写toString()方法,所以可以直接打印
		System.out.println(d);
		
		
		//方式二:采用SimpleDateFormat类来解析字符串
		String str = "2000-08-08 08:08:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d2 = sdf.parse(str);//此方法会抛出解析异常
		//输出结果
		System.out.println(d2);
		
		
		//格式化时间日期
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf2.format(d2));
	}
}
