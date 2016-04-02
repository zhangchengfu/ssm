package com.laozhang.xml.sax;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.laozhang.xml.entity.Address;
import com.laozhang.xml.entity.Student;


/**
 * @描述 学生事件处理类
 * @日期 May 21, 2013 2:22:13 PM
 * @作者 JSD1304
 */
public class StudentHandler extends DefaultHandler {
	private List<Student> students = new ArrayList<Student>();
	private Student student;
	private Address addr;
	private StringBuilder builder = new StringBuilder();

	@Override
	public void startDocument() throws SAXException {
		System.out.println("开始解析目标XML文档...");
	}

	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
		// 只要关心Student和Address标识,因为碰到它们要创建对象
		if (name.equals("student")) {
			// 创建对象
			student = new Student();
			// 设置属性值
			student.setId(Integer.valueOf(attributes.getValue("id")));
			// 添加到集合中
			students.add(student);
		} else if (name.equals("address")) {
			// 创建对象
			addr = new Address();
			// 把addr设置到学生对象中
			student.setAddr(addr);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		builder.append(ch, start, length);
	}

	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		// 做判断,再做属性赋值
		if (name.equals("name")) {
			student.setName(builder.toString().trim());
		} else if (name.equals("no")) {
			student.setNo(builder.toString().trim());
		} else if (name.equals("birthday")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birth = null;
			try {
				birth = sdf.parse(builder.toString().trim());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			student.setBirthday(birth);
		} else if (name.equals("province")) {
			addr.setProvince(builder.toString().trim());
		} else if (name.equals("city")) {
			addr.setCity(builder.toString().trim());
		}
		// 清空builder
		builder.delete(0, builder.capacity());
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("目标文档解析完毕...");
	}
	
	public List<Student> getStudents(){
		return students;
	}
}
