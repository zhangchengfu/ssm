package com.laozhang.corejava.day06;

/**
 * 账户类(只有实体类)
 */
public class Account2 {
	private long id;// 账户号码
	private String password;// 账户密码
	private String name;// 真实姓名
	private String personId;// 身份证号码
	private String email;// 客户的电子邮箱
	private double balance;// 账户余额

	public Account2() {

	}

	public Account2(long id, String password, String name, String personId,
			String email, double balance) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.personId = personId;
		this.email = email;
		this.balance = balance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
