package com.laozhang.xml.entity;

/**
 * @描述 地址实体类
 * @日期 May 21, 2013 2:25:53 PM
 * @作者 JSD1304
 */
public class Address {
	private String province;
	private String city;

	public Address() {

	}

	public Address(String province, String city) {
		this.province = province;
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("省份=").append(province).append(",城市=").append(city);
		return builder.toString();
	}
}
