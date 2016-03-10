package com.laozhang.corejava.day11;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @描述 使用正则表达式来规范输入
 * @日期 May 10, 2013 10:15:29 AM
 * @作者 JSD1304
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("请输入内容:");
			String str = sc.nextLine();
			if(Pattern.matches("[1-9][A-Z]{2,}", str)){
				System.out.println(str);
			}else{
				System.out.println("非法输入!");
			}
		}
	}
}
