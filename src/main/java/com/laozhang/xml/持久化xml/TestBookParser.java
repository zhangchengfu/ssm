package com.laozhang.xml.持久化xml;

import java.util.ArrayList;
import java.util.List;

import com.laozhang.xml.util.DateUtil;


/**
 * @描述 测试类
 * @日期 May 22, 2013 2:58:47 PM
 * @作者 JSD1304
 */
public class TestBookParser {
	public static void main(String[] args) {
		BookDom bd = new BookDom();
		Book b1 = new Book("100000","丰乳肥臀","莫言");
		BookInf inf = new BookInf(100,2000,"教育出版社",DateUtil.buildDate(2013, 1, 2));
		b1.setBookInf(inf);
		Book b2 = new Book("100001","蛙","莫言");
		Book b3 = new Book("100002","红高粱","莫言");
		Book b4 = new Book("100003","哈里波特","JK罗玲");
		Book b5 = new Book("100004","达芬奇密码","丹布朗");
		
		//创建集合添加图书
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		
		//调用
		boolean b = bd.writeBooksToXml(books, "F:\\books.xml");
		if(b){
			System.out.println("创建成功~");
		}
		
	}
}
