package com.laozhang.xml.entity;

import java.io.Serializable;

public class Book implements Cloneable, Comparable<Book>, Serializable {

	private static final long serialVersionUID = 211260034854928573L;

	private long id; // -> long
	private String name; // -> 书名 String
	private String author;// -> 作者 String
	private double price; // -> 单价 double
	private BookInfo bookinfo; // -> 图书明细,自定义类型 BookInfo

	public Book() {
		super();
	}

	public Book(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BookInfo getBookinfo() {
		return bookinfo;
	}

	public void setBookinfo(BookInfo bookinfo) {
		this.bookinfo = bookinfo;
	}

	/**************
	 * 把属性值按如下格式来拼接： [属性名=属性值,属性名=属性值,....]
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[id=").append(id).append(",name=").append(name)
				.append(",author=").append(author).append(",price=")
				.append(price).append("]");
		// 如果有bookinfo，则输出bookinfo,如果没有，则输出本书没有详细
		if (bookinfo != null) {
			builder.append("\n\t").append(bookinfo);// bookinfo.toString();
		} else {
			builder.append("\n\t本书无图书详细信息...");
		}
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));

		System.out.println("~~~~ hashcode: " + result);

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("~~~~ equals ...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();// 调用的是父类的clone方法.
	}

	public int compareTo(Book o) {
		System.out.println("~~~~~~");
		// 做强制类型转换
		// Book b = (Book)o;
		// 只比书名
		return name.compareTo(o.name);
	}
}
