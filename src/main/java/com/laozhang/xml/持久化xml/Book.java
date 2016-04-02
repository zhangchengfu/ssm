package com.laozhang.xml.持久化xml;

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
public class Book implements Serializable {

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

	public void setId(long id) {
		this.id = id;
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
		return result;
	}

	@Override
	public boolean equals(Object obj) {
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
}
