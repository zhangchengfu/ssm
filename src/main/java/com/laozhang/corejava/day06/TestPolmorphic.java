package com.laozhang.corejava.day06;

/**本类用来演示多态
 * 以及instanceof运算符
 */
public class TestPolmorphic {
	public static void main(String[] args) {
		//把对象的编译时类型写出父类到底有什么用?
		Animal c1 = new Cat("波斯猫","咪咪","白色",999.9);
		Animal d1 = new Dog("泰迪","旺财","棕色",99.9);
		
		//我该定义一个什么类型的数组来存放c1和d1呢?
		Animal[] animals = new Animal[2];
		animals[0] = c1;
		animals[1] = d1;
		
		//统一调用animal中的方法,利用多态
		for(Animal a : animals){
			a.eat();
			//为了避免类型转换异常险,再做强制类型转换前,先做判断
			if(a instanceof Cat){
				Cat c2 = (Cat)a;//强制类型转换
				c2.catchMouse();
			}
		}
	}
}
