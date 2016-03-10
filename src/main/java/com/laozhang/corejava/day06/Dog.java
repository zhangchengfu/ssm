package com.laozhang.corejava.day06;

/** 狗的实体类 子类 */
public class Dog extends Animal {
	// 特性成员都写在子类中

	// 属性
	//private String type;
	//private String name;
	//private String color;共性属性都上升到父类中了
	
	private double ZCD;// 忠诚度

	// 构造方法
	public Dog() {
		super();
		System.out.println("--子类空参构造");
	}

	public Dog(String type, String name, String color, double ZCD) {
		super(type, name, color);// super指代父类相应构造
		this.ZCD = ZCD;
		System.out.println("--子类有参构造");
	}

	public double getZCD() {
		return ZCD;
	}

	public void setZCD(double zcd) {
		ZCD = zcd;
	}

	// 狗特有的方法
	public void lookDoor() {
		System.out.println("狗在看门");
	}

	// 重写父类的方法
	@Override
	public void eat() {
		System.out.printf("类型:%s,名字:%s,颜色:%s,忠诚度:%5.2f,的狗在啃骨头.\n", getType(),
				getName(), getColor(), getZCD());
	}

	@Override
	public void spark() {
		System.out.printf("类型:%s,名字:%s,颜色:%s,忠诚度:%5.2f,的狗在叫.\n", getType(),
				getName(), getColor(), getZCD());
	}
}
