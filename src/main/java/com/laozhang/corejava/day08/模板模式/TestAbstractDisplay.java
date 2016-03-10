package com.laozhang.corejava.day08.模板模式;

/** 测试类 */
public class TestAbstractDisplay {
	public static void main(String[] args) {
		//创建一个打印模板对象
		AbstractDisplay ad = new NumberDisplay(7);
		//调用模板方法
		ad.topMethod();
	}
}
