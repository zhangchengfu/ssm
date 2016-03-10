package com.laozhang.corejava.day04;

/*********************
 * 方法参数传递的2种方式：
 * a.基本类型是 值传递
 * b.对象类型是 地址/引用传递
 */
public class ParamTransfer {

	/***********
	 * 交换两个数字
	 * @param a
	 * @param b
	 */
	public void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("a=%d,b=%d\n",a,b);
	}
	/*************
	 * 两个数组的交换
	 * @param a
	 * @param b
	 */
	public void swap(int[] a, int[] b){
		/*int[] temp = a;
		a = b;
		b = temp;*/
		for(int i=0;i<a.length;i++){
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;
		}
	}
	
}
