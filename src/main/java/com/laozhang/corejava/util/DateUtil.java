package com.laozhang.corejava.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*******************************************************************************
 * 日期工具类,本类中提供常见的日期操作
 */
public class DateUtil {

	/***************************************************************************
	 * 根据给定的 年、月、日来构造一个日期对象
	 * 
	 * @param year
	 *            年份
	 * @param month
	 *            月份,从1 ~12
	 * @param date
	 *            月日,从 1~31
	 * @return
	 */
	public static Date buildDate(int year, int month, int date) {
		// 利用 Calendar 对象
		Calendar cal = Calendar.getInstance(); // 简单工厂
		// 分别设置年、月、日
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1); // 因为calendar中是0~11
		cal.set(Calendar.DAY_OF_MONTH, date);
		// 返回日期
		return cal.getTime();
	}

	/***************************************************************************
	 * 格式化日期，本方法把日期格式化为：yyyy-MM-dd 形式
	 * 
	 * @param d
	 * @return
	 */
	public static String format(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(d);
	}

	/***************************************************************************
	 * 由调用者指定模式
	 * 
	 * @param d
	 * @param pattern
	 * @return
	 */
	public static String format(Date d, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(d);
	}

	/***************************************************************************
	 * 解析字符串为 日期， 本方法采用固定的解析格式：yyyy-MM-dd
	 * 
	 * @param dateStr
	 * @return
	 */
	public static Date parse(String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 解析异常
		try {
			Date d = sdf.parse(dateStr);
			return d;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/***************************************************************************
	 * 利用给定的模式来解析给定的字符串
	 * 
	 * @param dateStr
	 * @param pattern
	 * @return
	 */
	public static Date parse(String dateStr, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null; // 说明日期格式不合法.
	}

	/***************************************************************************
	 * change String to Date this method demand the String's form:
	 * "year/month/day"
	 * 
	 * @param dateStr
	 * @return Date
	 * @throws ParseException 
	 * @throws ParseException
	 * 
	 */
	public static Date createDate(String dateStr) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		return date.parse(dateStr);
	}

	/***************************************************************************
	 * judge the number of year if it is leapyear?
	 * 
	 * @param year
	 */
	public static boolean isLeapYear(int year) {
		// Calendar cal = Calendar.getInstance();
		// if (cal.YEAR % 4 == 0)
		if (year % 100 != 0 || year % 400 == 0) {
			if (year % 4 == 0) {
				return true;
			}
		}
		return false;
	}

	/***************************************************************************
	 * this method return assign year/month 's first day is Monday ~ Sunday as
	 * 2012.06.01 is 6(Friday)
	 * 
	 * @param year
	 * @param month
	 * @return return number, Sunday=1; Saturday=7
	 * 
	 */
	public static int getWeekDayInMonth(int year, int month) {
		// Date cal = DateUtil.createDate(year, month, 1);
		// return cal.getDay()-1;

		Calendar cal = Calendar.getInstance();

		// set year , month , day
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	public static int getMaxDays(int year, int month) {
		int days = -1;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			if (isLeapYear(year))
				days = 29;
			else
				days = 28;

		}
		return days;
	}
}
