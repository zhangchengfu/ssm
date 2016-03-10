package com.laozhang.corejava.day11;

/**
 * @描述 自定义异常类
 * @日期 May 10, 2013 1:53:09 PM
 * @作者 JSD1304
 */
public class DivideNotZero extends Exception{
	
	private static final long serialVersionUID = 8377918682779176050L;

	public DivideNotZero() {
		
	}
	
	public DivideNotZero(String msg){
		super(msg);
	}
	
	public DivideNotZero(String msg,Throwable cause){
		super(msg,cause);
	}
	
}
