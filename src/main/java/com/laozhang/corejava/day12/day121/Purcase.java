package com.laozhang.corejava.day12.day121;

/**
 * @描述：
 * @日期:May 13, 2013 6:45:57 PM
 * @作者：刘奎
 */
public class Purcase {

	private String brand; // 品牌
	private String name; // 产品名
	private double cost; // 费用

	public Purcase() {
		super();
	}

	public Purcase(String brand, String name, double cost) {
		super();
		this.brand = brand;
		this.name = name;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
