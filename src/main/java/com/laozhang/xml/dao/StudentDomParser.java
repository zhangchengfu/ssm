package com.laozhang.xml.dao;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.laozhang.xml.entity.Address;
import com.laozhang.xml.entity.Student;


/**
 * @描述 通过DOM解析students.xml
 * @日期 May 22, 2013 10:34:19 AM
 * @作者 JSD1304
 */
public class StudentDomParser {
	// 集合对象,用来保存所有学生对象
	private List<Student> students = new ArrayList<Student>();

	public List<Student> getStudentFromXml(String xmlfile) {
		// 采用DOM解析,把xmlfile中的数据转换成Java对象
		// 1.得到DOM解析的抽象工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			// 2.通过工厂获取抽象产品
			DocumentBuilder builder = factory.newDocumentBuilder();
			// 3.调用parse方法,产生文档树
			InputStream in = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream(xmlfile);
			Document doc = builder.parse(in);
			// 处理Document
			processDoc(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

	public void processDoc(Document doc) {
		// 1.获取根节点
		Element root = doc.getDocumentElement();
		// 2.获取所有student的子节点
		NodeList list = root.getElementsByTagName("student");
		// 3.迭代
		for (int i = 0; i < list.getLength(); i++) {
			Element studentElement = (Element) list.item(i);
			// 4.处理student元素(节点),一个student节点就对应一个student对象
			Student student = buildStudent(studentElement);
			// 5.把学生添加到集合中
			students.add(student);
		}
	}

	// 本方法把学生元素转换成学生对象并且都赋值好
	public Student buildStudent(Element studentElement) {
		Student student = new Student();
		// 1.设置属性
		student.setId(Integer.valueOf(studentElement.getAttribute("id")));
		// 2.依次给各自的子元素赋值
		String name = getTextValue(studentElement, "name");
		String no = getTextValue(studentElement, "no");
		String birthday = getTextValue(studentElement, "birthday");
		// 创建Address
		NodeList list = studentElement.getElementsByTagName("address");
		if (list != null && list.getLength() != 0) {
			// 说明address这个子元素有,就创建Address对象
			Address addr = new Address();
			Element addrElement = (Element) list.item(0);
			String province = getTextValue(addrElement, "province");
			String city = getTextValue(addrElement, "city");
			// 设置值
			addr.setProvince(province);
			addr.setCity(city);
			student.setAddr(addr);
		}
		// 设置学生的属性值
		student.setName(name);
		student.setNo(no);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date bitrh = sdf.parse(birthday);
			student.setBirthday(bitrh);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return student;
	}

	public String getTextValue(Element studentElement, String tagName) {
		Element temp = (Element) studentElement.getElementsByTagName(tagName)
				.item(0);
		return temp.getFirstChild().getNodeValue();
	}

	public static void main(String[] args) {
		StudentDomParser sdp = new StudentDomParser();
		List<Student> students = sdp
				.getStudentFromXml("/com/laozhang/xml/dtd/students.xml");
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
