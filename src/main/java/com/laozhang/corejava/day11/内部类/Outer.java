package com.laozhang.corejava.day11.内部类;

/**
 * @描述 内部类演示
 * @日期 May 10, 2013 3:29:34 PM
 * @作者 JSD1304
 */
public class Outer {
	// 定义外部类的属性
	private String[] datas = { "Jack", "LiLei", "HanMeiMei", "Mary", "Solo" };
	private int count = 0;
	private long id;

	// 定义外部类的静态成员
	private static long guid = 1;

	public Outer() {
		this.id = StaticInner.generated();
	}

	// 定义成员内部类
	private class MemberInner {
		// 定义内部类的属性
		private int count = 10;

		// 方法
		public void printDatas() {
			// 直接访问外部类的成员
			for (int i = 0; i < datas.length; i++) {
				System.out.printf("datas[%d] = %s\n", i, datas[i]);
			}
			System.out.printf("===内部类的count = %d.\n", count);
			System.out.printf("===外部类的count = %d.\n", Outer.this.count);
		}
	}

	// 定义静态内部类
	public static class StaticInner {
		private static long guid = 1;

		public static long generated() {
			// 直接访问外部类的静态成员
			return guid++;
		}
	}

	// 定义局部内部类
	public void output(int length) {
		final int len = length;
		System.out.printf("打印datas中前[%d]个数如下:\n", length);
		// 定义局部内部类
		class LocalInner implements Printable {
			public void print() {
				// 打印数组前length个元素
				if (len > datas.length) {
					for (int i = 0; i < datas.length; i++) {
						System.out.printf("datas[%d]=%s\n", i, datas[i]);
					}
				} else {
					for (int i = 0; i < len; i++) {
						System.out.printf("datas[%d]=%s\n", i, datas[i]);
					}
				}
			}
		}
		// 创建对象
		LocalInner li = new LocalInner();
		// 调用方法
		li.print();
	}

	// 定义匿名内部类
	public void output() {
		System.out.printf("打印datas中的所有数据如下:\n");
		// 定义匿名内部类
		new Printable() {
			public void print() {
				for (int i = 0; i < datas.length; i++) {
					System.out.printf("datas[%d]=%s\n", i, datas[i]);
				}
				System.out.println();
			}
		}.print();
	}
	
	//由于成员内部类对象的创建语法比较怪异,所以,不建议把成员内部类做成public,而应该
	//做成private,或者默认,这样,外界就不能直接访问了.
	public void print(){
		MemberInner mi = new MemberInner();
		mi.printDatas();
	}
}
