package com.laozhang.corejava.day08.模板模式;

/** 抽象父类 -- 模板类 */
public abstract class AbstractDisplay {
	//属性
	private int times;
	
	public AbstractDisplay(int times) {
		this.times = times;
	}
	
	//抽象方法
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	//定义打印的顶级业务流程模板方法
	public final void topMethod(){
		//第一步,先调用打开方法
		open();
		//第二步,打印
		for(int i = 0;i < times;i++){
			print();
		}
		//第三步,关闭
		close();
	}
}
