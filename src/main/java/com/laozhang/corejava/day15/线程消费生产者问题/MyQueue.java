package com.laozhang.corejava.day15.线程消费生产者问题;

import java.util.LinkedList;

/***********************
 * 使用链表来实现一个队列 队列是属于"先进先出" 的结构
 * 
 * @author Administrator
 * 
 */
public class MyQueue<E> {

	// 组合一个LinkedList
	private LinkedList<E> es = new LinkedList<E>();

	/***********************
	 * 队列的"进列"方法,相当于 addFirst
	 * 
	 * @param e
	 */
	public void put(E e) {
		es.addFirst(e);
	}

	/***********************
	 * 队列的"出列"方法,相当于 removeLast 方法
	 * 
	 * @return
	 */
	public E get() {
		return es.removeLast();
	}

	/********************
	 * 判断当前队列是否为 空(没有了元素)
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return es.isEmpty();
	}

	/**********************
	 * 获取队列中元素的个数
	 * 
	 * @return
	 */
	public int getSize() {
		return es.size();
	}

	/************************
	 * 打印队列中的数据
	 */
	public void printQueue() {
		for (E e : es) {
			System.out.print(e + ",");
		}
		System.out.println();
	}
}
