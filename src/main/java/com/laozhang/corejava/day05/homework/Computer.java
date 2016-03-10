package com.laozhang.corejava.day05.homework;

/**********************
 * 品牌 (如 联想\DELL\IBM 等) 价格 (如 4679.8) 描述 (对计算机的描述)
 * 
 * 显示器 (显示器信息)
 * 
 * @author Administrator
 * 
 */
public class Computer {

	private String brand;

	private double price;

	private String description;

	private Screen screen;

	public Computer(String brand, double price, String description) {
		this.brand = brand;
		// this.price = price;
		this.description = description;
		setPrice(price);
	}

	public Computer() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 1000 || price > 20000) {
			System.err.println("价格不合法.");
			this.price = 2000;
			return;
		}
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	/***********
	 * 输出当前计算机对象的 品牌\价格\描述,以及显示器的信息.
	 */
	public void outputComputerInfo() {
		// 格式化输出
		System.out.printf("品牌=%s,价格=%.2f,描述=%s\n", this.brand, this.price,
				description.substring(0, 4));
		if (screen != null) {
			System.out.printf("\t显示器：类型=%s,尺寸=%d,品牌=%s\n", screen.getType(),
					screen.getSize(), screen.getBrand());
		}
	}

}
