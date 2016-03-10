package com.laozhang.corejava.day04.homework;

public class GuessNumber {
	//属性
	private int randomNumber;//存放生成的随机数
	private int start;//起始范围
	private int end;//结束范围
	private int times;//用户猜测的次数
	
	
	//构造方法
	public GuessNumber() {

	}
	
	public GuessNumber(int randomNumber, int start, int end, int times) {
		this.randomNumber = randomNumber;
		this.start = start;
		this.end = end;
		this.times = times;
	}
	
	//对应属性的存取方法
	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}
	
}
