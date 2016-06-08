package com.laozhang.designpattern.flyweight;

public class FlyweightPattern {
	FlyweightFactory factory = new FlyweightFactory();
	Flyweight fly1;
	Flyweight fly2;
	Flyweight fly3;
	Flyweight fly4;
	Flyweight fly5;
	Flyweight fly6;
	public FlyweightPattern() {
		fly1 = factory.getFlyweight("Google");
		fly2 = factory.getFlyweight("Qutr");
		fly3 = factory.getFlyweight("Google");
		fly4 = factory.getFlyweight("Google");
		fly5 = factory.getFlyweight("Google");
		fly6 = factory.getFlyweight("Google");
	}
	public void showFlyweight() {
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		fly6.operation();
		int objSize = factory.getFlyweightSize();
		System.out.println("objSize = " + objSize);
	}
	public static void main(String[] args) {
		System.out.println("The FlyWeight Pattern!");
		FlyweightPattern fp = new FlyweightPattern();
		fp.showFlyweight();
	}
}
