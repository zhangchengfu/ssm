package com.laozhang.corejava.day12.day121;

/**
 * @描述：
 * @日期:May 13, 2013 7:07:14 PM
 * @作者：刘奎
 */
public class Purcase2 {
	private String brand;// 品牌
	private double tatalcost; // 费用

	public Purcase2() {

	}

	public Purcase2(String brand, double tatalcost) {
		super();
		this.brand = brand;
		this.tatalcost = tatalcost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getTatalcost() {
		return tatalcost;
	}

	public void setTatalcost(double tatalcost) {
		this.tatalcost = tatalcost;
	}

}
