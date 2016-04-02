package com.laozhang.xml.sax;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.laozhang.xml.entity.Student;


/**
 * @描述 本类使用SAX方式解析students.xml
 * @日期 May 21, 2013 2:34:42 PM
 * @作者 JSD1304
 */
public class StudentSaxParser {
	public static void main(String[] args) {
		// 创建对象
		StudentSaxParser ssp = new StudentSaxParser();
		// 创建集合存放解析出的学生对象
		List<Student> students = ssp
				.getStudentFromXml("com/xml/dtd/students.xml");
		// 遍历集合
		for (Student s : students) {
			System.out.println(s);
		}
	}

	public List<Student> getStudentFromXml(String xmlfile) {
		// 1.得到SAXParserFactory
		SAXParserFactory factory = SAXParserFactory.newInstance();
		// 2.得到SAXParser解析器
		try {
			SAXParser parser = factory.newSAXParser();
			// 3.解析文档
			// a.获取XML文档的输入流
			// InputStream in = new FileInputStream(xmlfile);
			InputStream in = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream(xmlfile);
			// b.写一个类,继承DefaultHandler,并且重写5个方法
			StudentHandler sh = new StudentHandler();
			//调用方法来解析
			parser.parse(in, sh);
			//返回已近通过XML解析赋值过的学生集合
			return sh.getStudents();
			
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
