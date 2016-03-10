package com.laozhang.corejava.day15.线程消费生产者问题;

/********************************
 * 消费者线程
 * 
 * @author yejf
 * 
 */
public class ConsumeThread extends Thread {

	private MyQueue<Integer> queues;

	private String name;
	private long duration;

	// 队列中最多存放的数据个数
	private static final int MAX_SIZE = 15;

	public ConsumeThread(MyQueue<Integer> queues, String name, long d) {
		this.queues = queues;
		this.name = name;
		this.duration = d;
		// 启动线程
		start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 负责消费数据,模拟每隔 duration 时长消费掉一个数据
		// synchronized(queues) {
		while (true) {
			// 产生随机数
			try {
				sleep(duration);
				synchronized (queues) {
					if (!queues.isEmpty()) {
						// 把数据从队列中移出
						Integer data = queues.get();
						System.out.println("消费者: " + name + " 消费了数据 -> "
								+ data.intValue());
					}
					// 喊醒其它线程
					queues.notifyAll();
					// 当队列中的数据个数低于最大数的20%时,就可以wait了
					if (queues.getSize() <= MAX_SIZE * 0.2) {
						queues.wait();
					}
				}
			} catch (InterruptedException e) {
				// e.printStackTrace();
				System.out.println("消费者: " + name + " 退出.");
				break;
			}
		}
		// }
	}
}
