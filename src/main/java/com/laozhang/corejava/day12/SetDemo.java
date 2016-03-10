package com.laozhang.corejava.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.laozhang.corejava.day10.homework.Book;
import com.laozhang.corejava.day10.homework.BookInf;
import com.laozhang.corejava.util.DateUtil;


/**
 * @描述 本类用来演示Set集合
 * @日期 May 13, 2013 11:10:09 AM
 * @作者 JSD1304
 */
public class SetDemo {
	public static void main(String[] args) {
		//创建集合
		Set<String> strSet = new HashSet<String>();
		Set<Book> bookSet = new HashSet<Book>();
		
		//添加元素
		strSet.add("奥迪");
		strSet.add("奔驰");
		strSet.add("宝马");
		strSet.add("奇瑞");
		strSet.add("奔驰");//重复算一个
		
		//遍历
		//增强for循环无视顺序,可以遍历无序集合
		for(String s : strSet){
			System.out.println(s);
		}
		
		//迭代器迭代
		System.out.println("---迭代器迭代---");
		Iterator<String> iter = strSet.iterator();
		while(iter.hasNext()){
			String s = iter.next();
			System.out.println(s);
		}
		
		System.out.println("------------------------------------");
		
		//创建图书信息
		BookInf inf = new BookInf(100,2000,"中华出版社",DateUtil.buildDate(2013, 5, 13));
		Book b1 = new Book("2000001","丰乳肥臀","莫言");
		b1.setBookInf(inf);//注册关系
		
		Book b2 = new Book("2000002","蛙","莫言");
		Book b3 = new Book("2000003","红高粱","莫言");
		Book b4 = new Book("2000004","哈利波特","JK罗林");
		Book b5 = new Book("2000004","哈利波特","JK罗林");
		
		//添加图书到集合中
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		bookSet.add(b5);
		
		//迭代器迭代
		System.out.println("---迭代器迭代---");
		Iterator<Book> iter2 = bookSet.iterator();
		while(iter2.hasNext()){
			Book b = iter2.next();
			System.out.println(b);
		}
	}
}
