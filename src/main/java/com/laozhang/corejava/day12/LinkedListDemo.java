package com.laozhang.corejava.day12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.laozhang.corejava.day10.homework.Book;
import com.laozhang.corejava.day10.homework.BookInf;
import com.laozhang.corejava.util.DateUtil;

/**
 * @描述 本类用来演示List集合
 * @日期 May 13, 2013 10:53:29 AM
 * @作者 JSD1304
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		//创建集合
		//加入泛型,可以约束存放在集合中元素的类型
		List<Integer> intList = new LinkedList<Integer>();
		intList.add(5);//自动封箱
		intList.add(Integer.valueOf(10));//把基本类型转换成包装类
		intList.add(10);//可添加重复元素
		intList.add(20);
		
		//迭代输出
		Iterator<Integer> iter = intList.iterator();
		while(iter.hasNext()){
			Integer i = iter.next();
			System.out.println(i);
		}
		
		//再创建一个集合
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
		
		//迭代
		Iterator<Book> iter2 = bookList.iterator();
		while(iter2.hasNext()){
			Book b = iter2.next();
			System.out.println(b);
		}
	}
}
