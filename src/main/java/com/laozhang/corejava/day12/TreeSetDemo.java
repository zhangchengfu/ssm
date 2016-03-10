package com.laozhang.corejava.day12;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.laozhang.corejava.day10.homework.Book;
import com.laozhang.corejava.day10.homework.BookInf;
import com.laozhang.corejava.util.DateUtil;


/**
 * @描述 本类用来演示TreeSet
 * @日期 May 13, 2013 11:23:15 AM
 * @作者 JSD1304
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// 创建集合
		Set<Book> bookSet = new TreeSet<Book>();

		// 创建图书信息
		BookInf inf = new BookInf(100, 2000, "中华出版社", DateUtil.buildDate(2013,
				5, 13));
		Book b1 = new Book("2000001", "丰乳肥臀", "莫言");
		b1.setBookInf(inf);// 注册关系

		Book b2 = new Book("2000002", "蛙", "莫言");
		Book b3 = new Book("2000003", "红高粱", "莫言");
		Book b4 = new Book("2000004", "哈利波特", "JK罗林");
		Book b5 = new Book("2000004", "哈利波特", "JK罗林");

		// 添加图书到集合中
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		bookSet.add(b5);

		System.out.println("======================================");

		// 第二种方式:传入指定类型的比较器进行比较
		// Comparator<Book> c = new BookNameComparator();

		Comparator<Book> c = BookComparatorFactory
				.getComparator(BookComparatorFactory.ISBN);

		Set<Book> bookTreeSet = new TreeSet<Book>(c);
		bookTreeSet.add(b1);
		bookTreeSet.add(b2);
		bookTreeSet.add(b3);
		bookTreeSet.add(b4);
		bookTreeSet.add(b5);

		// 迭代
		Iterator<Book> iter = bookTreeSet.iterator();
		while (iter.hasNext()) {
			Book b = iter.next();
			System.out.println(b);
		}
	}
}
