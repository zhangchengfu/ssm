package com.laozhang.corejava.day12;

import java.util.Comparator;

import com.laozhang.corejava.day10.homework.Book;


/**
 * @描述 按照书本名字来排序的比较器
 * @日期 May 13, 2013 1:52:19 PM
 * @作者 JSD1304
 */
public class BookNameComparator implements Comparator<Book>{
	/**
	 * 只针对书本名字排序
	 */
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
