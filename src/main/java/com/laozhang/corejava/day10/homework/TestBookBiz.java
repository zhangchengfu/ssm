package com.laozhang.corejava.day10.homework;

import com.laozhang.corejava.util.DateUtil;


public class TestBookBiz {

	public static void main(String[] args) {
		IBookBiz bookBiz = new ArrayBookBiz();
		// 创建图书对象
		Book b1 = new Book("100012011", "JAVA经典实例", "Ian F.Darwin");
		BookInf inf = new BookInf(138.5, 780, "机械工业出版社", DateUtil.buildDate(
				2010, 8, 18));
		b1.setBookInf(inf); // 注册关系
		Book b2 = new Book("200123412", "Java核心卷I", "James Golsing");
		Book b3 = new Book("300212114", "Effective Java", "Joshua Bloch");
		Book b4 = new Book("402323232", "Thinking In Java", "Bruce Eckel");

		Book b5 = new Book("502323232", "Thinking In Java", "Bruce Eckel");
		Book b6 = new Book("602323232", "Thinking In Java", "Bruce Eckel");

		// System.out.println(b1);

		bookBiz.add(b1);
		bookBiz.add(b2);
		bookBiz.add(b3);
		bookBiz.outputAllBooks();
		System.out.println("//------------------------------------------");
		bookBiz.add(b4);
		bookBiz.add(b5);
		bookBiz.add(b6);

		bookBiz.outputAllBooks();

		bookBiz.deleteByIsbn("300212114");
		// bookBiz.deleteByIsbn("23423");
		System.out
				.println("// ------------------------------------------------");
		bookBiz.outputAllBooks();
	}

}
