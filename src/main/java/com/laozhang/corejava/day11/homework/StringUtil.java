package com.laozhang.corejava.day11.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*****************************
 * 字符串的工具类
 * 
 * @包名 com.corejava.util
 * @文件名 StringUtil.java
 * @作者 yejf
 * @创建日期 2012-6-13
 * @版本 V1.0
 * 
 */
public class StringUtil {

	/**********************************
	 * 反转字符串
	 * 
	 * @param src
	 *            源字符
	 * @return 反转后的字符串
	 */
	public static String reverse(String src) {
		if (src == null || src.trim().length() == 0)
			return ""; // 直接返回空字符串
		StringBuilder builder = new StringBuilder(src);
		return builder.reverse().toString();
	}

	/*********************
	 * 判断给定的字符串是否是单词 这里只认为str都是由字母组成即可,不保证这个单词有一个有效的英文单词
	 * 
	 * @param src
	 * @return
	 */
	public static boolean isWord(String src) {
		if (src == null || src.trim().length() == 0)
			return false;
		/*
		 * boolean word = true; //先把字符串转成字符数组,再依次判断 char[] arr =
		 * src.toCharArray(); for(int i=0;i<arr.length;i++) {
		 * //只要有一个不是字母,则表示这个不是单词 if(!Character.isLetter(arr[i]) &&
		 * !Character.isWhitespace(arr[i])){ word = false; break; } } return
		 * word;
		 */
		// 采用正则表达式
		String regex = "[a-z ,'.A-Z-]+";
		return src.matches(regex);
	}

	/*******************************
	 * 判断是否是合法数字
	 * 
	 * @param src
	 *            源字符串
	 * @return 返回true 或 false
	 */
	public static boolean isDigit(String src) {
		if (src == null || src.trim().length() == 0)
			return false;
		/*
		 * if(src.equals("0")) //0也是数字 return true; if(src.startsWith("0"))
		 * //合法的数字不应是0开头 return false; char[] arr = src.toCharArray(); for(int
		 * i=0;i<arr.length;i++) { if(!Character.isDigit(arr[i])) { return
		 * false; } } return true;
		 */
		// 采用正则表式 [不考虑8进制\16进制]
		// String regex = "0|[1-9][0-9]*";
		String regex = "-?[0-9]*.[0-9]*";
		return src.matches(regex);
	}

	/*********************************
	 * 判断字符串是否是空字符串 按JAVA中定义标准的空白字符,有: '\u0009'，水平制表符。 ' '，换行。 '\u000B'，纵向制表符。
	 * '\u000C'，换页。 ' '，回车。 '\u001C'，文件分隔符。 '\u001D'，组分隔符。 '\u001E'，记录分隔符。
	 * '\u001F'，单元分隔符。
	 * 
	 * @param src
	 *            目标字符串
	 * @return 返回 true 或 false
	 */
	public static boolean isBlank(String src) {
		if (src == null)
			return false;
		if (src.trim().length() == 0)
			return true;
		char[] arr = src.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (!Character.isWhitespace(arr[i])) {
				return false;
			}
		}
		return true;
	}

	/****************************************
	 * 重复字符串
	 * 
	 * @param src
	 * @param count
	 * @return
	 */
	public static String repeat(String src, int count) {
		final String REGEX = " ";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < count; i++) {
			builder.append(src);
			if (i != count - 1)
				builder.append(REGEX);
		}
		return builder.toString();
	}

	/******************************
	 * 得到target在src中出现的次数. 采用正则表达式来统计
	 * 
	 * @param src
	 *            源字符串
	 * @param regex
	 *            目标字符串
	 * @return 如果一次都没有，则返回-1
	 */
	public static int matches(String src, String regex) {
		int count = 0;
		if (src == null || src.trim().length() == 0) {
			return -1;
		}
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(src);
		while (m.find()) { // 每匹配一次，count++
			count++;
		}
		return count;
	}
}
