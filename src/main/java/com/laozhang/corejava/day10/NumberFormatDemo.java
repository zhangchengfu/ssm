package com.laozhang.corejava.day10;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @描述 数字的格式化
 * @日期 May 9, 2013 3:33:37 PM
 * @作者 JSD1304
 */
public class NumberFormatDemo {
	public void formatOutput(){
		//利用NumberFormat格式化数字
		double[] datas = {3.1415926,2.4,0.78546,512416.2213,123};
		//NumberFormat nf = NumberFormat.getInstance();//通用格式
		//NumberFormat nf = NumberFormat.getInstance(Locale.US);//指定语言环境格式
		NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.US);//指定语言环境下的货币格式
		//设置小数位
		nf.setMinimumFractionDigits(1);//设置小数位最大
		nf.setMaximumFractionDigits(1);//设置小数位最小
		
		nf.setMaximumIntegerDigits(3);//注意数字的完整性
		nf.setMinimumIntegerDigits(2);//注意数字的完整性
		
		for(int i = 0;i < datas.length;i++){
			String str = nf.format(datas[i]);
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		NumberFormatDemo nfd = new NumberFormatDemo();
		nfd.formatOutput();
	}
}
