package com.laozhang.corejava.day06;

public class TestAnimal {
	public static void main(String[] args) {
		//Dog d = new Dog();//递归调用父类的构造
		
		//前三个属性是从父类继承得到
		//Dog d = new Dog("泰迪","旺财","棕色",99.99);
		//Cat c = new Cat("波斯猫","咪咪","白色",999.9);
//		
//		d.eat();//由于继承,从父类获取的方法
//		d.spark();//由于继承,从父类获取的方法
//		d.lookDoor();
//		
//		c.eat();
//		c.spark();
//		//c.lookDoor();没有狗中的看门特有方法
//		c.catchMouse();
		
		//通过父类编译时类型,创建子类对象
		Animal c = new Cat();
		c.eat();
		c.spark();
		//c.catchMouse();编译错误,无法调用该方法
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
