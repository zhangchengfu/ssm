package com.laozhang.corejava.day15.线程案例;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class 定时器1_闹钟起床 {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.SECOND,10);
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("起床吧!");
			}
		},cal.getTime(),1000L*60*60*24);
	}
}
