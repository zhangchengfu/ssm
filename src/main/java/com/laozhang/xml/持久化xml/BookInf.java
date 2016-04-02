package com.laozhang.xml.持久化xml;

import java.io.Serializable;
import java.util.Date;

import com.laozhang.xml.util.DateUtil;


public class BookInf implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 388402984934990312L;
	// 单价
	private double price;
	// 总页数
	private int pages;
	// 出版社
	private String publishingHouse;
	// 出版日期
	private Date publishDate;

	public BookInf(double price, int pages, String publishingHouse,
			Date publishDate) {
		super();
		this.price = price;
		this.pages = pages;
		this.publishingHouse = publishingHouse;
		this.publishDate = publishDate;
	}

	public BookInf() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tBookInf [price=").append(price).append(", pages=")
				.append(pages).append(", publishingHouse=")
				.append(publishingHouse).append(", publishDate=")
				.append(DateUtil.format(publishDate, "yyyy-MM-dd"))
				.append("]");
		return builder.toString();
	}

}
