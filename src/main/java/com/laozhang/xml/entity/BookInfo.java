package com.laozhang.xml.entity;

import java.util.Date;

import com.laozhang.xml.util.DateUtil;


public class BookInfo implements Cloneable {

	private String publisher; // 出版社 (publisher), String
	private Date publish_date; // 出版日期(publish_date) , Date
	private int pages; // 页数(pages), int
	private String description; // 描述,description, String

	public BookInfo(String publisher, Date publish_date, int pages,
			String description) {
		super();
		this.publisher = publisher;
		this.publish_date = publish_date;
		this.pages = pages;
		this.description = description;
	}

	public BookInfo() {
		super();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[出版社=").append(publisher).append(",出版日期=")
				.append(DateUtil.format(publish_date)).append(",页数=")
				.append(pages).append(",描述=").append(description).append("]");
		return builder.toString();
	}
}
