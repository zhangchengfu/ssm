package com.laozhang.corejava.day06;

/**测试类*/
public class TestAccount {
	public static void main(String[] args) {
		//创建银行账户
		Account2 acc = new Account2(10000,"123","张三","123","123@qq.com",2000);
		AccountBiz ab = new AccountBiz();
		System.out.println(ab.deposit(acc, 1000));
		System.out.println(ab.withdraw(acc, 1500));
	}
}
