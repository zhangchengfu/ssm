package com.laozhang.corejava.day06;

/**
 * 银行账户的业务类
 */
public class AccountBiz {
	// 存款方法,参数是double型的金额
	public double deposit(Account2 acc, double money) {
		acc.setBalance(acc.getBalance() + money);
		return acc.getBalance();
	}

	// 取款方法,参数是double型的金额
	public double withdraw(Account2 acc, double money) {
		acc.setBalance(acc.getBalance() - money);
		return acc.getBalance();
	}
}
