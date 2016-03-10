package com.laozhang.corejava.day15.线程案例;

import java.util.Scanner;

public class IO挂起演示 {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				Scanner console = new Scanner(System.in);
				System.out.println("请输入信息：");
				String str = console.nextLine();
				System.out.println("输入信息是:"+str);
			}
		};
		t.start();
	}
}

//nextLine()将引起当前线程进入IO Block(IO 等待)状态
//直到IO结束以后线程返回到Runnable继续执行
//引起IO Block的方法很多:readLine(),read(),readInt(),nextInt()等
//IO Block:也称为,IO阻塞,IO挂起,IO等待