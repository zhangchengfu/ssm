package com.laozhang.corejava.day10.homework;

import java.io.Serializable;

/***********************************
 * 如果要被持久化，则需要实现 Serializable 接口
 * 
 * @包 com.corejava.day08.homework
 * @日期 Jun 20, 2012
 * @文件 Book.java
 * @作者 Steven Ye
 * @版本 v1.0
 * 
 */
public class Book implements Serializable, Comparable<Book> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4127226433534170553L;

	private static int guid = 1;

	private long id;

	private String isbn;

	private transient String name; // 此属性在对象持久化时不会被持久化

	private String author;

	private BookInf bookInf; // 关联关系

	public Book(String isbn, String name, String author, BookInf bookInf) {
		super();
		this.id = generateId();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.bookInf = bookInf;
	}

	public Book(String isbn, String name, String author) {
		super();
		this.id = generateId();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
	}

	public Book() {
		super();
		this.id = generateId();
	}

	public long getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BookInf getBookInf() {
		return bookInf;
	}

	public void setBookInf(BookInf bookInf) {
		this.bookInf = bookInf;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=").append(id).append(", isbn=").append(isbn)
				.append(", name=").append(name).append(", author=")
				.append(author);
		if (bookInf != null) {
			builder.append(bookInf.toString());
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("--- hashcode: " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("--- equals.");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private long generateId() {
		return guid++;
	}

	/*******************************
	 * @param o
	 *            参与比较的图书
	 * @return 返回值为0，表示两个对象相等，返回值为1，表示当前对象“大于”O， 返回值为-1，表示当前对象“小于”O
	 * 
	 *         本例比较图书对象的 编号、书名、作者。 首先按书名比较，如果书名相同，就按作者比较，如果作者也相同，就按编号比。
	 */
	public int compareTo(Book o) {
		System.out.println("compareTo..");
		if (name.equals(o.name)) {
			if (author.equals(o.author)) {

				return isbn.compareTo(o.isbn);

			} else {
				return author.compareTo(o.author);
			}
		} else {
			return name.compareTo(o.name);
		}
	}
}
