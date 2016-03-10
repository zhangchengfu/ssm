package com.laozhang.corejava.day15.线程消费生产者问题;

/******************************
 * 生产者线程
 * 
 * @author yejf
 * 
 */
public class ProduceThread extends Thread {

	// 可以做为排它锁，还是容器,也是临界资源
	private MyQueue<Integer> queues;

	private String name;
	private long duration; // 生产时长
	// 队列中最多存放的数据个数
	private static final int MAX_SIZE = 15;

	public ProduceThread(MyQueue<Integer> queues, String name, long d) {
		this.queues = queues;
		this.name = name;
		this.duration = d;
		// 启动线程
		start();
	}

	@Override
	public void run() {
		// 负责产生数据,并放入到队列中,模拟每隔duraion产生一个数据
		// synchronized(queues) {
		while (true) {
			// 产生随机数
			int random = generateNumber(100);
			try {
				sleep(duration);
				System.out.println("生产者: " + name + " 生产了数据 -> " + random);
				// 把数据添加到队列中
				synchronized (queues) {
					if (queues.getSize() < MAX_SIZE) {
						queues.put(new Integer(random));
					}
					// System.out.println("生产者: "+name+" 生产了数据 -> "+random);
					// 喊醒其它线程
					queues.notifyAll();
					// 当生产的数据个数达到最大值的80%时,就可以进行wait了
					if (queues.getSize() >= MAX_SIZE * 0.8) {
						queues.wait();
					}
				}
			} catch (InterruptedException e) {
				// e.printStackTrace();
				System.out.println("生产者: " + name + " 退出.");
				break;
			}

		}
		// }
	}

	/*****************************
	 * 随机产生整数
	 * 
	 * @return
	 */
	private int generateNumber(int base) {
		// TODO Auto-generated method stub
		return (int) (Math.random() * base);
	}

}
