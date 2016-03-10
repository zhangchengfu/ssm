package com.laozhang.corejava.day06;

public class Cat extends Animal{
	//属性
	private double meng;//萌度
	
	//构造
	public Cat() {
		
	}

	public Cat(String type, String name, String color,double meng) {
		super(type, name, color);
		this.meng = meng;
	}

	public double getMeng() {
		return meng;
	}

	public void setMeng(double meng) {
		this.meng = meng;
	}
	
	//特有方法
	public void catchMouse(){
		System.out.println("猫抓老鼠");
	}
	
	//重写父类的方法
	@Override
	public void eat() {
		//super.eat();//super可以指代父类对象
		System.out.println("猫在吃鱼!");
		
	}
	@Override
	public void spark() {
		System.out.println("猫在叫$@(*^(*)@!#");
	}
}
