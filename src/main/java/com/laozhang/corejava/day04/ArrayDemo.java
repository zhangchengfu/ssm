package com.laozhang.corejava.day04;

import java.util.Arrays;

/**
 * 本类用来演示数组的声明赋值遍历
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// 声明
		// 1.声明数组类型以及长度,但是没有给元素赋值
		// 数组的类型是数组,其中的元素可以是基本类型,也可以是对象类型(内置,自定义皆可)
		int[] arr1 = new int[5];// []中的数字表示数组的长度,数组中有几个元素,长度必须有
		int arr2[] = new int[5];
		String[] arr3 = new String[3];

		System.out.println(arr3[0]);
		// System.out.println(arr3[3]);error
		// 访问数组元素可以通过下标来定位,下标范围[0,length-1]
		// 如果访问数组时候,下标超过最大值,则会报
		// java.lang.ArrayIndexOutOfBoundsException:数组下标越界异常

		// 每个数组都有一个属性,length,表示数组长度,这个值一旦创建,不能改变
		System.out.println(arr3.length);

		// 2.创建数组的同时直接赋值
		String[] arr4 = { "大众", "宝马", "奔驰" };
		String[] arr5 = new String[] { "大众", "宝马", "奔驰" };
		System.out.println(arr5[2]);
		// 此写法[]中不用写长度,基本不用

		// 赋值
		// 1.通过下标一一赋值
		arr1[0] = 10;
		arr2[1] = 5;
		// ....

		// 2.通过普通for循环给数组元素赋值
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.println();

		// 3.Arrays.fill();
		// Arrays类是数组操作的工具类
		// Arrays.fill(arr3, "奔驰");
		Arrays.fill(arr3, 1, 2, "奔驰");
		//指定下标(包含)到指定下标(不包含)赋值成相应值
		System.out.println(Arrays.toString(arr3));
		
		
		//打印数组元素,也叫做遍历,也叫做迭代
		//1.通过下标一一打印
		//System.out.println(arr1[0]);
		//...
		
		//2.普通for循环遍历
		for(int i = 0;i <arr4.length;i++){
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		
		//3.JDK1.5过后增强for循环遍历
		//语法:
		/*for(类型 变量名 : 数组名){
			
		}*/
		//注意:
		//1.增强for循环可以遍历数组,集合,字符串等
		//2.增强for循环可以无视顺序遍历
		//3.增强for循环是只读型
		
		for(String s : arr4){
			System.out.print(s + " ");
		}
		System.out.println();
				
		//4.Arrays.toString(数组名);
		String line = Arrays.toString(arr4);
		System.out.println(line);
		
		//Arrays.toString()如何实现?
		System.out.print("[");
		for(int i = 0;i <arr4.length;i++){
			if(i == arr4.length - 1){
				System.out.print(arr4[i]);
			}else{
				System.out.print(arr4[i] + ", ");
			}
		}
		System.out.println("]");

	}
}
