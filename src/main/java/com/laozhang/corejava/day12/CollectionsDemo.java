package com.laozhang.corejava.day12;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.laozhang.corejava.day10.homework.Book;
import com.laozhang.corejava.day10.homework.BookInf;
import com.laozhang.corejava.util.DateUtil;


/**
 * @描述 本类用来演示集合操作工具类Collections
 * @日期 May 13, 2013 3:36:36 PM
 * @作者 JSD1304
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		List<Book> bookList = new LinkedList<Book>();
		//创建图书信息
		BookInf inf = new BookInf(100,2000,"中华出版社",DateUtil.buildDate(2013, 5, 13));
		Book b1 = new Book("2000001","丰乳肥臀","莫言");
		b1.setBookInf(inf);//注册关系
		
		Book b2 = new Book("2000002","蛙","莫言");
		Book b3 = new Book("2000003","红高粱","莫言");
		Book b4 = new Book("2000004","哈利波特","JK罗林");
		Book b5 = new Book("2000004","哈利波特","JK罗林");
		
		//添加图书到集合中
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		
		//排序,采用自然排序
		//Collections.sort(bookList);
		//输出
		//outputList(bookList);
		
		//我们一般采用Comparator比较器来比较
		Comparator<Book> c = BookComparatorFactory.getComparator(BookComparatorFactory.ISBN);
		System.out.println("---按照ISBN排序---");
		Collections.sort(bookList,c);
		outputList(bookList);
		System.out.println("-----------------------");
		Collections.reverse(bookList);//反转
		outputList(bookList);
		System.out.println("-----------------------");
		Collections.shuffle(bookList);//随机打乱
		outputList(bookList);
		System.out.println("---按照作者排序---");
		Comparator<Book> c2 = BookComparatorFactory.getComparator(BookComparatorFactory.AUTHOR);
		Collections.sort(bookList,c2);
		outputList(bookList);
	}

	public static void outputList(List<Book> bookList) {
		Iterator<Book> iter = bookList.iterator();
		while(iter.hasNext()){
			Book b = iter.next();
			System.out.println(b);
		}
	}
}
