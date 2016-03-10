package com.laozhang.corejava.day15.线程案例;

import java.util.Timer;
import java.util.TimerTask;

public class 定时器2_考试计时 {
	public static void main(String[] args) {
		System.out.println("考试开始！");
		final Timer timer = new Timer();
		long time = 1000*60*60*2;
		final long timeout = System.currentTimeMillis()+time;
		timer.schedule(new TimerTask(){
			public void run(){
				long now = System.currentTimeMillis();
				long show = timeout-now;
				long h = show/1000/60/60;
				long m = show/1000/60%60;
				long s = show/1000%60;
				System.out.println(h+":"+m+":"+s);
			}
		},0,1000);
		
		timer.schedule(new TimerTask(){
			public void run(){
				timer.cancel();
				System.out.println("考试结束！");
			}
		},time);
	}
}
