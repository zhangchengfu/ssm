package com.laozhang.corejava.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @描述 本类用来演示ArraysList
 * @日期 May 13, 2013 10:31:53 AM
 * @作者 JSD1304
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建一个集合
		List strList = new ArrayList();
		//输出集合容量
		System.out.println("当前集合容量为:" + strList.size());
		
		//添加元素到集合中
		strList.add(100);
		strList.add("奥迪");
		strList.add(3.14);
		
		//在指定位置上添加元素
		strList.add(1, "奔驰");
		
		//输出集合容量
		System.out.println("当前集合容量为:" + strList.size());
		
		//删除数组元素
		strList.remove(1);
		
		//判断数组是否为空
		System.out.println(strList.isEmpty());
		
		//清空数组元素
		//strList.clear();
		//System.out.println("当前集合容量为:" + strList.size());
		
		//遍历
		for(int i = 0;i < strList.size();i++){
			System.out.println(strList.get(i));
		}
		
		//增强for循环
		System.out.println("---增强for循环---");
		for(Object o : strList){
			System.out.println(o);
		}
		
		//转换成数组遍历
		System.out.println("---转换成数组遍历---");
		System.out.println(Arrays.toString(strList.toArray()));
		
		//集合迭代器
		System.out.println("---迭代器迭代---");
		Iterator iter = strList.iterator();//创建一个迭代器
		while(iter.hasNext()){
			//调用next()方法来获取元素
			Object o = iter.next();
			//输出
			System.out.println(o);
		}
	}
}
