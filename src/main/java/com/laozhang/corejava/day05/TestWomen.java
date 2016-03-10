package com.laozhang.corejava.day05;

/**测试类 */
public class TestWomen {
	public static void main(String[] args) {
		Women wo1 = new Women("韩梅梅",160,90,true);
		Women wo2 = new Women("Marry",170,95,true);
		Women wo3 = new Women("张大妈",155,135,false);
		System.out.println(wo3.getName());
		wo3.setName("李大妈");
		System.out.println(wo3.getName());
	}
}
