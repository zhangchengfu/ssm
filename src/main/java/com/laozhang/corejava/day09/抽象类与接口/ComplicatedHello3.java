package com.laozhang.corejava.day09.抽象类与接口;

public class ComplicatedHello3 implements IHello3,IAnimal3{
	public void sayHello(String name) {
		System.out.println("复杂打招呼:" + name);
	}
}
