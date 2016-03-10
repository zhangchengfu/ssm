package com.laozhang.corejava.day11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @描述 正则表达式API的使用
 * @日期 May 10, 2013 9:59:14 AM
 * @作者 JSD1304
 */
public class RegexDemo {
	private String content;// 存放文本内容

	// 构造方法初始化文本信息
	public RegexDemo() {
		StringBuilder builder = new StringBuilder();
		// 添加内容到builder中
		builder.append("Java is a very good programing lauguage,").append(
				"It was develop by SUN in 1996,").append(
				"Java was not similar with JavaScript.").append(
				"If you want to learning Java,Please contact me at:").append(
				"allan0716@gmail.com or 1381234567.");
		content = builder.toString();
	}

	/**
	 * 本方法用来根据指定参数来匹配content中的内容
	 */
	public void matches(String regex) {
		// 将给定的正则表达式编译到模板中
		Pattern p = Pattern.compile(regex);
		// 创建Matcher
		Matcher m = p.matcher(content);
		// 进行匹配
		boolean found = false;
		// 提示输出
		System.out.printf("===开始在文本中搜索[%s]...\n", regex);
		// 当找到的时候
		while (m.find()) {
			found = true;
			// 输出
			System.out.printf("匹配[%s]字符在[%d~%d]位置处.\n", m.group(), m.start(), m
					.end());
		}
		//如果没有找到
		if(!found){
			System.out.printf("文本中没有匹配[%s]的数据.\n",regex);
		}
	}
	
	public static void main(String[] args) {
		RegexDemo rd = new RegexDemo();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("请您输入您要查的字符:");
			String regex = sc.nextLine();
			if(regex.equals("exit")){
				System.out.println(":)谢谢使用!");
				break;
			}
			rd.matches(regex);
		}
	}
}
