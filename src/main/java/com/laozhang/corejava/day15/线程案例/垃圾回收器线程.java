package com.laozhang.corejava.day15.线程案例;

public class 垃圾回收器线程 {
	public static void main(String[] args) throws Exception {
		Wolf w = new Wolf();
		w = null;//释放对象的引用,对象将被回收,不是立即回收
		System.gc();//通知垃圾回收器尽快回收内存,对象发生回收
		Thread.sleep(1000*5);
	}
}

/** 这个方法会在对象被回收时候由垃圾回收器调用
 * finalize()在Object中声明,一般不建议覆盖,如果覆盖
 * 必须调用super.finalize()合理安全释放资源 */
class Wolf{
	String name = "终结者";
	protected void finalize() throws Throwable {
		super.finalize();
		Thread t = Thread.currentThread();//t引用了垃圾回收器线程
		System.out.println("Call finalize()in"+" "+t.getName());
		System.out.println("I will be back!");
	}
}
