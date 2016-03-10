package com.laozhang.corejava.interview;

public class Worf extends Animal {
	private String name;
	private double weight;

	public Worf(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getDesc() {
		return "Worf:" + name + "和" + weight;
	}

	public static void main(String[] args) {
		System.out.println(new Worf("狼", 10));
	}

}
