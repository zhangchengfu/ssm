package com.laozhang.corejava.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @描述 本类用来演示泛型
 * @日期 May 14, 2013 10:43:11 AM
 * @作者 JSD1304
 */
public class GenericDemo {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(5);
		numList.add(15);
		numList.add(20);
		outputList(numList);
		System.out.println("-----------------------------");
		
		List<Long> longList = new ArrayList<Long>();
		longList.add(100L);
		longList.add(200L);
		longList.add(300L);
		outputList(longList);
		System.out.println("-----------------------------");
		
		//泛型是编译时概念,运行时会被擦除
		System.out.println(numList.getClass() == longList.getClass());//true
		
		List<?> strList2 = new ArrayList<String>();
		//strList2.add("你好!")//编译错误
		strList2.add(null);
	}

	//负责输出打印
	public static void outputList(List<? extends Number> list) {
		Iterator<?> iter = list.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			System.out.println(o);
		}
	}
}
