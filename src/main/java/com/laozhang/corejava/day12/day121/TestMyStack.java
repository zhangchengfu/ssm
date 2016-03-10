/**
 * 
 */
package com.laozhang.corejava.day12.day121;

/**
 * @描述：
 * @日期:May 13, 2013 4:19:35 PM
 * @作者：刘奎
 */
public class TestMyStack {
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push("小猪");
		ms.push("小狗");
		ms.push("小猫");
		ms.push("小狼");
		ms.push("小猪");
		ms.push("小猪");
		ms.push("小虎");
		ms.push("小狮");
		ms.push("小猪");
		ms.push("小狮");
		System.out.println(ms.count);
		System.out.println(ms.pop());

	}
}
