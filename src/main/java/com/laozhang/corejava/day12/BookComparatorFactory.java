package com.laozhang.corejava.day12;

import java.util.Comparator;

import com.laozhang.corejava.day10.homework.Book;


/**
 * @描述 图书比较器工厂
 * @日期 May 13, 2013 1:58:16 PM
 * @作者 JSD1304
 */
public class BookComparatorFactory {
	public static final int ISBN = 1;
	public static final int NAME = 2;
	public static final int AUTHOR = 3;
	
	/**
	 * 根据不同参数创建比较器
	 */
	public static Comparator<Book> getComparator(int type){
		Comparator<Book> c = null;
		switch (type) {
		case ISBN:
			c = new Comparator<Book>(){
				public int compare(Book o1, Book o2) {
					return o1.getIsbn().compareTo(o2.getIsbn());
				}
			};
			break;
		case NAME:
			c = new Comparator<Book>(){
				public int compare(Book o1, Book o2) {
					return o1.getName().compareTo(o2.getName());
				}
			};
			break;
		case AUTHOR:
			c = new Comparator<Book>(){
				public int compare(Book o1, Book o2) {
					return o1.getAuthor().compareTo(o2.getAuthor());
				}
			};
			break;
		default:
			throw new IllegalArgumentException("参数不合法!");
		}
		return c;
	}
}
