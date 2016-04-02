package com.laozhang.xml.sax;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.laozhang.xml.entity.Book;


/**********************
 * 本类采用 SAX 方式去解析 dtd/books.xml文档
 */
public class BookSaxParser {

	public static void main(String[] args) {
		BookSaxParser bsp = new BookSaxParser();
		List<Book> books = bsp.parseXml("src/com/xml/dtd/books.xml");
		for (Book b : books) {
			System.out.println(b);
		}
	}

	/*********************
	 * 本方法采用SAX解析方式来解析给定的xml文档
	 * 
	 * @param xmlpath
	 *            xml文档路径
	 * @return
	 */
	public List<Book> parseXml(String xmlpath) {
		// 创建File对象，判断此文件是否存在
		File xmlFile = new File(xmlpath);
		if (!xmlFile.exists()) {
			System.err.println(xmlpath + " 不存在...");
			return null;
		}
		// 三步曲
		// 1.创建SAX解析器工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		// 2.通过工厂来创建SAX解析器
		try {
			SAXParser parser = factory.newSAXParser();
			// 3.调用 parse 方法，来解析目标XML文档
			// 4.写一个类继承 DefaultHandler类，并重写你感兴趣的方法
			BookHandler dh = new BookHandler();
			parser.parse(xmlFile, dh);
			// 5.返回处理结果
			return dh.getBooks();

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
