package com.laozhang.corejava.day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.laozhang.corejava.day10.homework.Book;


public class ObjectStreamDemo {

	// 用来存放数据的文件
	private String file = "books.dat";

	public List<Book> loadBooks() {
		ObjectInputStream ois = null;
		List<Book> books = null;
		try {
			ois = new ObjectInputStream(new BufferedInputStream(
					new FileInputStream(file)));
			books = (List<Book>) ois.readObject();
			System.out.println("-- 加载所有图书成功.");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return books;
	}

	public void persistList(List<Book> books) {
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream(file)));
			// 写对象到文件中
			oos.writeObject(books);
			// 刷新缓存
			oos.flush();
			System.out.println("-- 持久化图书集合成功。");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ObjectStreamDemo demo = new ObjectStreamDemo();
		/*
		 * //模拟数据 Book b1 = new Book("100012011", "JAVA经典实例", "Ian F.Darwin");
		 * BookInf inf = new BookInf(138.5,780,"机械工业出版社"
		 * ,DateUtil.createDate(2010,8,18)); b1.setBookInf(inf); //注册关系 Book b2
		 * = new Book("200123412", "Java核心卷I", "James Golsing"); Book b3 = new
		 * Book("300212114", "Effective Java", "Joshua Bloch"); Book b4 = new
		 * Book("402323232", "Thinking In Java", "Bruce Eckel");
		 * 
		 * Book b5 = new Book("502323232", "Thinking In Java", "Bruce Eckel");
		 * //放入到集合中 List<Book> books = new ArrayList<Book>(); books.add(b1);
		 * books.add(b2); books.add(b3); books.add(b4); books.add(b5);
		 * 
		 * //持久化 demo.persistList(books);
		 */
		// 从文件中恢复JAVA对象
		/*
		 * List<Book> books = demo.loadBooks(); for(Book b : books) {
		 * System.out.println(b); b.setName("<更新书名>"); } //重新持久化
		 * demo.persistList(books);
		 */
		// 再读出
		System.out.println("==========================================");
		
		//从本地文件加载读取
		List<Book> books = demo.loadBooks();
		for (Book b : books) {
			System.out.println(b);
		}
	}
}
