package com.laozhang.corejava.day04;

import java.util.Arrays;

/**
 * 本类通过数组复制的方式实现数组元素的增删
 */
public class ArrayCopyDemo {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {2,4,6,10,11,12};
		
		//在6和10之间添加一个8,并且删除11,12这个元素
		
		//定义一个数组,长度为6+1-2 = 5
		int[] dest = new int[5];
		
		//数组复制
		System.arraycopy(arr, 0, dest, 0, 3);
		dest[3] = 8;
		System.arraycopy(arr, 3, dest, 4, 1);
		
		//遍历
		System.out.println(Arrays.toString(dest));
	}
}
