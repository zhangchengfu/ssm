package com.laozhang.corejava.day10.homework;

/****************************************
 * 数组图书管理业务实现类 本实现类采用的是数组来管理所有图书信息,只能在内存中操作图书, 不具备持久化图书的能力.
 * 
 * @包名 com.corejava.day08.homework
 * @文件名 ArrayBookBiz.java
 * @作者 yejf
 * @创建日期 2012-6-12
 * @版本 V1.0
 * 
 */
public class ArrayBookBiz implements IBookBiz {
	/** 默认数组容量 */
	private static final int CAPACITY = 5;
	/** 有效图书数量 */
	private int count;
	/** 真正存放图书的数组,是一个容器 */
	private Book[] books = new Book[CAPACITY];

	public int length() {
		return count;
	}

	public int capacity() {
		return books.length;
	}

	public void add(Book book) {
		if (count == books.length) {
			// 意味着当前的数组已经存不下图书了,需要扩容
			System.out.println("扩容.......");
			expand();
		}
		// 把图书添加到数据容器中
		books[count++] = book;
	}

	/*************************
	 * 当前数组扩容
	 */
	private void expand() {
		// 创建一个新的数组,每次扩容以2倍于之前的容量来创建
		Book[] expand = new Book[books.length * 2];
		// 把原来数据COPY到新数中来
		System.arraycopy(books, 0, expand, 0, books.length);
		// 再把扩容后的数据赋值给 books
		books = expand;
	}

	public void deleteByIsbn(String isbn) {
		// 首先,找到这个图书
		int idx = findElementAt(isbn);
		if (idx != -1) { // 说明找到了
			for (int i = idx; i < count - 1; i++) {
				// 依次把后一个元素移动到前一个
				books[i] = books[i + 1];
			}
			// 最后,有效图书数量减1
			count--;
		} else {
			System.out.printf("[%s] 此图书不存在.\n", isbn);
		}
	}

	/***********************************
	 * 查找图书所在数组中的位置,如果没有找到,则返回-1;
	 * 
	 * @param isbn
	 * @return
	 */
	private int findElementAt(String isbn) {
		int idx = -1;
		for (int i = 0; i < count; i++) {
			Book book = books[i];
			if (book.getIsbn().equals(isbn)) {
				idx = i;
				break;
			}
		}
		return idx;
	}

	/***********************
	 * 输出所有有效图书
	 */
	public void outputAllBooks() {
		for (int i = 0; i < count; i++) {
			System.out.println(books[i]);
		}
	}

	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		
	}
}
