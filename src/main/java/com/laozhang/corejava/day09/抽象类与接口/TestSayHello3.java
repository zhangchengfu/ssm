package com.laozhang.corejava.day09.抽象类与接口;

public class TestSayHello3 {
	public static void main(String[] args) {
		IHello3 ih1 = new SimpleHello3();
		IHello3 ih2 = new ComplicatedHello3();
		
		IHello3[] ih = new IHello3[2];
		ih[0] = ih1;
		ih[1] = ih2;
		
		for(IHello3 i : ih){
			if(i instanceof IAnimal3){
				System.out.println("对牛弹琴!");
			}else{
				i.sayHello("张三");
			}
		}
	}
}
