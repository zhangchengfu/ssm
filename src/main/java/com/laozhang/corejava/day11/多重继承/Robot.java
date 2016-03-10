package com.laozhang.corejava.day11.多重继承;

/**
 * @描述 子类
 * @日期 May 10, 2013 4:24:24 PM
 * @作者 JSD1304
 */
public class Robot extends Person {
	
	private Machine heart;//关联
	
	//采用组合
	public Robot(String name,int speed) {
		super(name);
		heart = new Heart(speed);
	}

	@Override
	public void run() {
		System.out.printf("机器人:[%s]启动.\n",getName());
		heart.run();
	}
	
	//提供一个内部类,来实现Matchine接口
	private class Heart implements Machine{
		private int speed;
		
		public Heart(int speed) {
			this.speed = speed;
		}
		
		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		public void run() {
			System.out.printf("机器心脏启动,转速[%d]r/s",speed);
		}
	}
}
