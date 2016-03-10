package com.laozhang.corejava.day15.线程消费生产者问题;

import java.util.ArrayList;
import java.util.List;

/*************************
 * 本类监控生产者->消费者线程,并负责中止这些线程
 * 
 * @author yejf
 * 
 */
public class MonitorSynchronized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 用来存放所有线程
		List<Thread> allThreads = new ArrayList<Thread>();
		// 临界资源
		MyQueue<Integer> queues = new MyQueue<Integer>();

		for (int i = 0; i < 5; i++) {
			allThreads.add(new ProduceThread(queues, "产" + (i + 1),
					3000 + (i * 200)));
		}
		for (int i = 0; i < 50; i++) {
			allThreads.add(new ConsumeThread(queues, "消" + (i + 1),
					3000 + (i * 300)));
		}

		// 主线程负责每隔30秒不停地查看 queues中数据的变化
		monitorQueue(30000L, queues);

		System.out.println("主线程2秒钟后开始中断所有线程...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 中断线程
		for (Thread t : allThreads)
			t.interrupt();

		// 等待所有线程退出.
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 最后,再输入队列中的数据盘点
		System.out.println("---- 主线程: 最后队列中所有数据如下 ------");
		queues.printQueue();
		System.out.println("---- main exit. -------");
	}

	/**************************
	 * 监控队列中数据的变化
	 * 
	 * @param l
	 */
	private static void monitorQueue(long l, MyQueue<Integer> queue) {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(l);
				System.out.println("主线程输出......");
				queue.printQueue();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("................. output end .........");
		}
	}

}
