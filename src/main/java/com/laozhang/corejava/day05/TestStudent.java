package com.laozhang.corejava.day05;

import com.laozhang.corejava.util.DateUtil;


/** 学生测试类 */
public class TestStudent {
	public static void main(String[] args) {
		// 创建一个没有班级信息的学生
		Student st1 = new Student("张三", "男", DateUtil.buildDate(1990, 8, 8));

		// 创建班级对象
		Clazz cl1 = new Clazz("JSD1304", 30);

		// 让st1学员进入cl1班级
		st1.setClazz(cl1);

		// 获取st1学员所在班级的容量
		System.out.println(st1.getClazz().getCap());

		// 直接创建一个在班级里面的同学
		Student st2 = new Student("李四", "女", DateUtil.buildDate(1990, 8, 8),
				new Clazz("JSD1305", 20));
		System.out.println(st2.getClazz().getCap());
	}
}
