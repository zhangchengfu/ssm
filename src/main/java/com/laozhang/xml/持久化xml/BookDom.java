package com.laozhang.xml.持久化xml;

import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.laozhang.xml.util.DateUtil;


/**
 * @描述 持久化对象到文件中
 * @日期 May 22, 2013 2:20:38 PM
 * @作者 JSD1304
 */
public class BookDom implements IBookWriter {

	public boolean writeBooksToXml(List<Book> books, String file) {
		boolean result = false;
		// 1.把book的集合转换成document对象
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.newDocument();
			// 创建根节点,节点命名为books
			Element root = doc.createElement("books");
			// 添加到doc中
			doc.appendChild(root);
			// 依次循环集合,把每个book对象,转换成element元素
			Iterator<Book> iter = books.iterator();
			while (iter.hasNext()) {
				Book book = iter.next();
				Element bookElement = createElement(doc, book);
				root.appendChild(bookElement);
			}
			// 2.把document对象写入到目标文件中
			result = DomWriter.writeXml(doc, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 把book对象转换成Element对象的方法
	 */
	public Element createElement(Document doc, Book book) {
		// 创建一个元素
		Element bookElement = doc.createElement("book");
		// 添加属性
		bookElement.setAttribute("id", String.valueOf(book.getId()));
		// 添加子元素
		bookElement.appendChild(createElement(doc, "isbn", book.getIsbn()));
		bookElement.appendChild(createElement(doc, "name", book.getName()));
		bookElement.appendChild(createElement(doc, "author", book.getAuthor()));
		// 添加bookinfo子节点,如果有的话
		if (book.getBookInf() != null) {
			BookInf inf = book.getBookInf();
			Element infElement = doc.createElement("bookinfo");
			// 添加bookinfo的子元素
			infElement.appendChild(createElement(doc, "price", String
					.valueOf(inf.getPrice())));
			infElement.appendChild(createElement(doc, "pages", String
					.valueOf(inf.getPages())));
			infElement.appendChild(createElement(doc, "publish_house", inf
					.getPublishingHouse()));
			infElement.appendChild(createElement(doc, "publish_date", DateUtil
					.format(inf.getPublishDate(), "yyyy-MM-dd")));
			bookElement.appendChild(infElement);
		}
		return bookElement;
	}

	/**
	 * 创建子元素的方法
	 */
	public Node createElement(Document doc, String tagName, String value) {
		Element element = doc.createElement(tagName);
		element.setTextContent(value);
		return element;
	}
}
