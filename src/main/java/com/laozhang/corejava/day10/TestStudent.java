package com.laozhang.corejava.day10;

import com.laozhang.corejava.util.DateUtil;


/**
 * @描述 学生的测试类
 * @日期 May 9, 2013 10:58:34 AM
 * @作者 JSD1304
 */
public class TestStudent {
	public static void main(String[] args) {
		// 创建学生
		Student s1 = new Student(100, "张三", "男", DateUtil.parse("1990-8-8"));
		// 创建班级
		Clazz c1 = new Clazz("JSD1304班", 30);

		// 整合班级和学生
		s1.setClazz(c1);
		System.out.println(s1);

		// 再创建两个学生
		Student s2 = new Student(101, "李四", "男", DateUtil.parse("1990-8-8"));
		Student s3 = new Student(100, "张三", "男", DateUtil.parse("1990-8-8"));
		s3.setClazz(c1);
		
		// System.out.println(s1.equals(s3));
		// System.out.println(s1.hashCode() + "\t" + s3.hashCode());

		// 克隆一个对象
		try {
			Student s4 = (Student) s1.clone();//浅层复制
			System.out.println(s4 == s1);// false
			System.out.println(s4.equals(s1));// true
			System.out.println(s1.hashCode() + "\t" + s4.hashCode());
			
			//修改基本类型以及String/Date会使对象不相等(深层复制)
			//s1.setName("王五");
			//s1.setStuNo(200);
			
			//修改对象类型不会造成对象不等(浅层复制,共享属性)
			s1.getClazz().setCapacity(50);
			System.out.println(s4.equals(s1));

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
