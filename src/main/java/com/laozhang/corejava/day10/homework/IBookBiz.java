package com.laozhang.corejava.day10.homework;

public interface IBookBiz {

	// 添加图书
	void add(Book b);

	// 根据isbn 来删除指定图书
	void deleteByIsbn(String isbn);

	// 打印出所有的图书信息
	void outputAllBooks();
	
	//按照名字来删除图书信息的方法
	void deleteByName(String name);
	
}
