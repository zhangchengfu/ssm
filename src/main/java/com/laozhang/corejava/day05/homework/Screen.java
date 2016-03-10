package com.laozhang.corejava.day05.homework;

/***********************
 * 
 * @author Administrator
 * 
 */
public class Screen {

	private String type;

	private int size;

	private String brand;

	public Screen() {
	}

	public Screen(String type, int size, String brand) {
		this.type = type;
		// this.size = size;
		this.brand = brand;
		setSize(size);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	// 做业务判断
	public void setSize(int size) {
		if (size == 17 || size == 19 || size == 23 || size == 25) {
			this.size = size;
		} else {
			System.err.println("输入的尺寸不合法.");
			this.size = 17;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
