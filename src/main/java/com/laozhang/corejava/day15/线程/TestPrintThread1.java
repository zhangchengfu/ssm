package com.laozhang.corejava.day15.线程;

import java.util.ArrayList;
import java.util.List;

/**
 * @描述 测试类
 * @日期 May 16, 2013 2:36:16 PM
 * @作者 JSD1304
 */
public class TestPrintThread1 {
	public static void main(String[] args) {
		//获取当前正在执行的线程
		Thread mainThread = Thread.currentThread();
		//创建集合来存放创建的对象
		List<Thread> threads = new ArrayList<Thread>();
		
		//打印当前正在执行的线程的名字
		System.out.println(mainThread.getName() + "正在执行...");
		
		//创建线程对象
		PrintThread1 pt = new PrintThread1("苗明线程~");
		//启动线程
		//pt.start();
		
		//把创建的线程放入集合中
		threads.add(pt);
		
		//再创建一个线程
		PrintThread1 pt2 = new PrintThread1("张成付线程~");
		//pt2.start();
		threads.add(pt2);
		
		try {
		    /*
			//main线程等待pt线程执行结束
			pt.join();//等待该线程终止。
			//main线程等待pt2线程执行结束
			pt2.join();//等待该线程终止。
            */			
			for(Thread t : threads){
				t.start();
				t.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(mainThread.getName() + "运行结束...");
	}
}
