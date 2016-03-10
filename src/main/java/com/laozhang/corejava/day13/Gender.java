package com.laozhang.corejava.day13;

/**
 * @描述 性别枚举
 * @日期 May 14, 2013 1:52:18 PM
 * @作者 JSD1304
 */
public enum Gender {
	MALE//相当于public static final Gender MALE = new Gender();
	,FMALE;//这里的;,如果后面没有代码了,则可以省略,否则必须填上
	
	//枚举常量也叫做枚举值,多个枚举值之间用,隔开
	
	//构造方法:一定要私有化,可以省略,如果不写,系统会自动生成
	private Gender(){
		
	}
}
