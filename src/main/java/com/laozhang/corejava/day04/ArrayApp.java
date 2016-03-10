package com.laozhang.corejava.day04;

/**
 * 本类用来演示数组的常用操作: 求极值,排序,查找目标元素的下标,删除元素,插入元素
 */
public class ArrayApp {
	/**
	 * 找出指定数组的最大值,如果数组为空,则返回-1
	 */
	public static int maxElement(int[] arr) {
		// 非空判断,任何操作对象类型都要做非空判断
		if (arr == null) {
			return -1;
		} else {
			// 假设第一个元素是最大的
			int max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			return max;
		}
	}

	/**
	 * 找出指定数组的最小值,如果数组为空,则返回-1
	 */
	public static int minElement(int[] arr) {
		if (arr == null) {
			return -1;
		} else {
			// 假设第一个元素时最小的
			int min = arr[0];
			// 循环,依次与后面的元素进行比较,如果找到比它还打的,就赋值给自己
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			// 直接返回
			return min;
		}
	}

	/**
	 * 冒泡排序 从小到大依次排列
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// 做判断
				if (arr[i] > arr[j]) {
					// 交换
					int temp = arr[i];// 通过临时变量temp来暂时存放arr[i]的值
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	/**
	 * 冒泡排序 从大到小依次排列
	 */
	public static void bubbleSort2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// 做判断
				if (arr[i] < arr[j]) {
					// 交换
					int temp = arr[i];// 通过临时变量temp来暂时存放arr[i]的值
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	/**
	 * 从指定数组中查找目标元素,并返回下标,如果不存在,则返回-1
	 */
	public static int getElement(int[] arr, int target) {
		// 定义变量来存放目标元素的下标
		int index = -1;
		// 循环数组,依次与target做比较
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				index = i;
				break;
			}
		}
		return index;
	}

	/**
	 * 添加元素的方法
	 */
	public static int[] insertElement(int[] src, int pos, int val) {
		// 定义新数组,长度为原数组+1
		int[] dest = new int[src.length + 1];
		// for循环插入点之前的数值一一赋值
		for (int i = 0; i < pos; i++) {
			dest[i] = src[i];
		}
		// 插入点的值直接赋值
		dest[pos] = val;
		// 插入点之后,错位赋值
		for (int i = pos + 1; i < dest.length; i++) {
			dest[i] = src[i - 1];
		}
		return dest;
	}

	/**
	 * 删除元素的两种方法方法 通过下标删除
	 */
	public static int[] deleteElement1(int[] src, int pos) {
		if (pos < 0 || pos >= src.length) {
			return src;
		} else {
			int[] dest = new int[src.length - 1];
			for (int i = 0; i < pos; i++) {
				dest[i] = src[i];
			}
			for (int i = pos; i < dest.length; i++) {
				dest[i] = src[i + 1];
			}
			return dest;
		}
	}

	/**
	 * 删除元素的两种方法方法 删除指定元素
	 */
	public static int[] deleteElement2(int[] src, int target) {
		// 定义计数器存放target元素在原数组中出现的次数
		int count = 0;
		for (int i = 0; i < src.length; i++) {
			if (src[i] == target) {
				count++;
			}
		}
		//定义新数组
		int[] dest = new int[src.length - count];
		
		//定义新数组下标
		int index = 0;
		for(int i = 0;i <src.length;i++){
			if(src[i] != target){
				dest[index++] = src[i];
			}
		}
		return dest;
	}
}
