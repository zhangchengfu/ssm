package com.laozhang.corejava.day07.homework;

/******************
 * 汽车管理类
 * 
 * @author Administrator
 * 
 */
public class VehicleMgmt {

	// private static Vehicle[] vehicles;

	public static final int BIKE_TYPE = 1;
	public static final int CAR_TYPE = 2;
	public static final int PLANE_TYPE = 3;

	public static void goHome(Vehicle vehicle) {
		System.out.println("准备回家...");
		// 回调 (callback)
		vehicle.run(); // 多态体现
		System.out.println("结束...");
	}

	/*******************
	 * 参数type的值来自于如下三个常量：
	 * 
	 * @see BIKE_TYPE
	 * @see CAR _TYPE
	 * @see PLANE_TYPE
	 * @param type
	 * @return 这个例子也是一个"简单工厂“模式的体现 工厂的目的是：生产对象。
	 *         其实:java.util.Calendar类就是一个简单工厂模式, 它的具体实现的子类是：GregorianCalendar
	 *         而我们编程时，从来不关心 GregorianCalendar 这个子类。 甚至在代码中不会直现面向它编程.
	 */
	public static Vehicle getVehicle(int type) {
		Vehicle v = null;
		if (type == BIKE_TYPE) {
			v = new Bike();
		} else if (type == CAR_TYPE) {
			v = new Car();
		} else if (type == PLANE_TYPE) {
			v = new Plane();
		} else {
			System.err.println("你输入有误..");
		}
		return v;
	}

	public static void main(String[] args) {
		Vehicle v = getVehicle(1);
		goHome(v);
	}
}
