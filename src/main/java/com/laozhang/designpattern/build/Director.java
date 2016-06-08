package com.laozhang.designpattern.build;

public class Director {
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
		
	}
}
