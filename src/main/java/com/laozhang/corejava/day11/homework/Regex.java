package com.laozhang.corejava.day11.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		
		String str = "The Associated Press won an award for its series on "+
		             "the profiling of Muslims by the New York Police "+
		             "Department."+
		             "But for the first time since 1977 there was no prize "+
		             "for fiction.The Pulitzer panel praised the Patriot-News.";
		
		Pattern p1 = Pattern.compile("[0-9]+");
		Matcher m1 = p1.matcher(str);
		while(m1.find()){
			String s = m1.group();
			System.out.printf("在本文中的数字有:%s\n",s);
		}
		Pattern p2 = Pattern.compile("[a-zA-Z_0-9]+");
		Matcher m2 = p2.matcher(str);
		int count = 0;
		System.out.println("本文的单词:");
		while(m2.find()){
			String s = m2.group();
			count++;
			System.out.printf("%s\n",s);
		}
		System.out.printf("在本文中的单词共有%d个",count);
	}
	
}
