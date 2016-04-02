package com.laozhang.xml.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.laozhang.xml.entity.Book;
import com.laozhang.xml.entity.BookInfo;
import com.laozhang.xml.util.DateUtil;


/********************
 * SAX事件处理器
 * 
 * @author JSD1211
 * 
 */
public class BookHandler extends DefaultHandler {

	private Book currentBook;
	private BookInfo currentInfo;
	private StringBuilder builder = new StringBuilder();
	// 存放所有图书信息
	private List<Book> books = new ArrayList<Book>();

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// 把元素中间的文本数据添加到builder中
		builder.append(ch, start, length);
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("--文档解析结束...");
	}

	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		String content = builder.toString().trim();
		// 分别给属性赋值
		if (name.equals("name")) {
			// 给图书名设置
			currentBook.setName(content);
		} else if (name.equals("author")) {
			// 给图书作者赋值
			currentBook.setAuthor(content);
		} else if (name.equals("price")) {
			currentBook.setPrice(Double.parseDouble(content));
		} else if (name.equals("publish_house")) {
			// 给图书信息对象的属性赋值
			currentInfo.setPublisher(content);
		} else if (name.equals("publish_date")) {
			currentInfo.setPublish_date(DateUtil.parse(content));

		} else if (name.equals("pages")) {
			currentInfo.setPages(Integer.parseInt(content));
		} else if (name.equals("description")) {
			currentInfo.setDescription(content);
		}
		// 清空 builder中的数据
		builder.delete(0, builder.capacity());
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("--开始解析目标xml文档...");
	}

	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
		if (name.equals("book")) {
			// 初始化currentBook对象
			currentBook = new Book();
			// 设置属性 [根据属性名来获取属性值]
			String id = attributes.getValue("id");
			currentBook.setId(Long.parseLong(id));
			// 把图书对象添加到集合中
			books.add(currentBook);
		} else if (name.equals("bookinfo")) {
			// 初始化currentInfo对象
			currentInfo = new BookInfo();
			// 把此对象设置到 book中
			currentBook.setBookinfo(currentInfo);
		}
	}

	public List<Book> getBooks() {
		return books;
	}
}
