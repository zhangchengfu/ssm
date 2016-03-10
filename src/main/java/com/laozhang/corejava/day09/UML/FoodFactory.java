package com.laozhang.corejava.day09.UML;

/** 工厂类 */
public class FoodFactory {
	public static Food createFood(){
		return new Sandwich();
	}
}
