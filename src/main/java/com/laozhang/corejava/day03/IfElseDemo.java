package com.laozhang.corejava.day03;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 本类使用if else以及Calendar类来获取当前系统星期
 */
public class IfElseDemo {
	public static void main(String[] args) {
		System.out.println("今天是:" + printWeekDay());
	}
	
	public static String printWeekDay(){
		//Calendar创建对象,获得一个日历对象
		//Calendar cal = new GregorianCalendar();此创建方式不推荐
		
		Calendar cal = Calendar.getInstance();
		
		//通过相应字段来获取日历中的某一个值
		//获取1-7的整数,星期天为1,星期六为7
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		//定义空字符串
		String msg = "";
		
		//判断星期
		if(day == 1){
			msg = "星期天";
		}else if(day == 2){
			msg = "星期一";
		}else if(day == 3){
			msg = "星期二";
		}else if(day == 4){
			msg = "星期三";
		}else if(day == 5){
			msg = "星期四";
		}else if(day == 6){
			msg = "星期五";
		}else{
			msg = "星期六";
		}
		return msg;
	}
}
