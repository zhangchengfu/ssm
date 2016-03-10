package com.laozhang.corejava.day09.UML;

public class TestSandwich {
	public static void main(String[] args) {
		Food sandwich = FoodFactory.createFood();
		sandwich.make();
	}
}
