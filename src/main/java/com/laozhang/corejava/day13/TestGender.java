package com.laozhang.corejava.day13;

/**
 * @描述 枚举测试类
 * @日期 May 14, 2013 1:58:53 PM
 * @作者 JSD1304
 */
public class TestGender {
	public static void main(String[] args) {
		Gender g = Gender.FMALE;
		System.out.println(g.name());//获取枚举值的名称
		
		Gender[] genders = Gender.values();//把枚举值存放到数组中

		for(Gender gen : genders){
			System.out.println(gen);
		}
	}
}
