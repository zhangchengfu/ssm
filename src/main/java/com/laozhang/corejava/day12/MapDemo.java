package com.laozhang.corejava.day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.laozhang.corejava.day10.homework.Book;
import com.laozhang.corejava.day10.homework.BookInf;
import com.laozhang.corejava.util.DateUtil;


/**
 * @描述 本类用来演示Map集合
 * @日期 May 13, 2013 2:41:10 PM
 * @作者 JSD1304
 */
public class MapDemo {
	public static void main(String[] args) {
		//创建集合,key是Integer,value是String
		Map<Integer, String> mp1 = new HashMap<Integer, String>();
		
		//添加数据
		mp1.put(5,"five");
		mp1.put(1,"First");
		mp1.put(2,"First");
		mp1.put(4,"First");
		mp1.put(3,"Three");
		mp1.put(1,"First-Again");//会覆盖相同key值的元素
		
		//调用keySet()来获取Set
		Set<Integer> set = mp1.keySet();
		//遍历Set
		Iterator<Integer> iter1 = set.iterator();
		while(iter1.hasNext()){
			Integer key = iter1.next();
			//通过key值来获取value
			String value = mp1.get(key);
			//输出
			System.out.printf("%s ==> %s\n",key,value);
		}
		
		System.out.println("-------------------------------------");
		
		//再创建一个Map
		Map<String, Book> bookMap = new HashMap<String, Book>();
		
		//创建图书信息
		BookInf inf = new BookInf(100,2000,"中华出版社",DateUtil.buildDate(2013, 5, 13));
		Book b1 = new Book("2000001","丰乳肥臀","莫言");
		b1.setBookInf(inf);//注册关系
		
		Book b2 = new Book("2000002","蛙","莫言");
		Book b3 = new Book("2000003","红高粱","莫言");
		Book b4 = new Book("2000004","哈利波特","JK罗林");
		Book b5 = new Book("2000004","哈利波特","JK罗林");
		
		//添加图书到集合中
		bookMap.put(b1.getIsbn(),b1);
		bookMap.put(b2.getIsbn(),b2);
		bookMap.put(b3.getIsbn(),b3);
		bookMap.put(b4.getIsbn(),b4);
		bookMap.put(b5.getIsbn(),b5);
		
		//采用entrySet来迭代
		printEntrySetMap(bookMap);
	}
	
	public static void printEntrySetMap(Map<String, Book> bookMap) {
		Set<Entry<String, Book>> set = bookMap.entrySet();
		Iterator<Entry<String, Book>> iter = set.iterator();
		while(iter.hasNext()){
			Entry<String,Book> entry = (Entry<String, Book>)iter.next();//获得Entry对象
			String key = (String)entry.getKey();//从Entry对象中获取原本的key值
			Book value  = (Book)entry.getValue();//从Entry对象中获取原本的value值
			//输出
			System.out.printf("%s ==> %s\n",key,value);
		}
	}
}
