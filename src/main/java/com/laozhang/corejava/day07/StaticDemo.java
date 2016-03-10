package com.laozhang.corejava.day07;

/**
 * 本类用来演示static关键字
 */
public class StaticDemo {
	private long id;// 成员变量,域
	private static long guid;// 类变量

	// 普通代码块:只要创建对象,就会被执行(一般不使用)
	{
		System.out.println("--普通代码块被调用了");
	}

	// 静态代码块:类加载的时候执行,只执行一次
	static {
		System.out.println("--静态代码块被调用了");
		//System.exit(0);//强制退出JVM进程
	}

	public StaticDemo() {
		System.out.println("--构造方法被调用了");
		// 生成ID
		this.id = generateId();
	}

	// 静态方法,生成唯一性ID
	public static long generateId() {
		return guid++;
	}

	// 非静态方法可以访问静态属性
	public long getGuid() {
		return guid;
	}

	public long getId() {
		return id;
	}

	public static void main(String[] args) {
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		System.out.println(s1.getId() + "\t" + s2.getId() + "\t" + s3.getId());
	}
}
