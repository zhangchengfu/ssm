package com.laozhang.corejava.day08.模板模式;

/** 具体的模板类*/
public class NumberDisplay extends AbstractDisplay{
	
	public NumberDisplay(int times) {
		super(times);
	}

	@Override
	public void close() {
		System.out.println();//换行
		System.out.println("}");
		System.out.println("=== 谢谢使用 ===");
	}

	@Override
	public void open() {
		System.out.println("=== 欢迎光临 ===");
		System.out.println("打印的随机数如下:");
		System.out.println("{");
	}

	@Override
	public void print() {
		//产生随机数
		int random = (int)(Math.random()*35 + 1);
		System.out.printf("%4d",random);
		try {
			Thread.sleep(2000);//停顿2000毫秒,也就是2秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
