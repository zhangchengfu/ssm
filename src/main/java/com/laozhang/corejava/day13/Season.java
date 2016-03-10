package com.laozhang.corejava.day13;

/**
 * @描述 季节枚举类
 * @日期 May 14, 2013 2:22:58 PM
 * @作者 JSD1304
 */
public enum Season {
	SPRING("春天"){
		@Override
		public Season next() {
			return SUMMER;
		}
	}
	,SUMMER("夏天"){
		
		@Override
		public Season next() {
			return AUTUMN;
		}
	}
	,AUTUMN("秋天"){
		@Override
		public Season next() {
			return WINTER;
		}
	}
	,WINTER("冬天"){
		@Override
		public Season next() {
			return SPRING;
		}
	};
	
	//普通属性
	private String symbol;
	
	//构造方法
	private Season(String symbol){
		this.symbol = symbol;
	}
	
	//抽象方法
	public abstract Season next();
}
