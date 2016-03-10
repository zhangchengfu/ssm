package com.laozhang.corejava.day12.day121;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @描述：
 * @日期:May 13, 2013 3:52:23 PM
 * @作者：刘奎
 */
public class MyStack {
	private static final int j = 0;
	int count = 0 ;
	private LinkedList lt;

	public MyStack() {
		lt = new LinkedList();
	}

	public int push(Object obj) {
		if(obj==null){
			System.out.println(count);
		}else{
			lt.addFirst(obj);
			System.out.println(obj+"进栈....");
			count++;
		}
		return count;
	}

	public Object pop() {
		if (isEmpty()) {
			System.out.println("该栈是空的.....");
			return null;
		}
		return lt.remove()+"出栈.....";
	}

	public Object seek() {
		if (isEmpty()) {
			System.out.println("该栈是空的.....");
			return null;
		}else{
			for(int i=count;i>0;i--){
				return lt.getLast();
			}
		}
		return null;
		
	}

	private boolean isEmpty() {
		return lt.isEmpty();
	}
}
