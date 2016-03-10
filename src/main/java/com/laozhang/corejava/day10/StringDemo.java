package com.laozhang.corejava.day10;

/**
 * @描述 字符串的相关操作
 * @日期 May 9, 2013 4:37:36 PM
 * @作者 JSD1304
 */
public class StringDemo {
	private static String content;

	// 通过静态代码块来给属性赋值
	static {
		StringBuilder builder = new StringBuilder();
		builder.append("This is a log file,it was store at").append(
				"\"d:\\Program File\\temp\" ").append(
				"directory.the format of log file was:\n").append(
				"20130509:Jack:M:1990-08-08");
		content = builder.toString();
	}

	public static void main(String[] args) {
		// 截取此字符串
		int start = content.indexOf("\"");// 从第一个引号开始
		int end = content.indexOf("\"", start + 1);// 到第二个引号结束

		String path = content.substring(start + 1, end);//截取字符串起始包含,结束不包含
		System.out.println(path);
		
		//2.替换第一个引号之前的部分
		//先准备一个容器来存放替换好的字符串
		StringBuilder builder = new StringBuilder();
		builder.append(content.substring(0,start+1).replace(" ","*"));
		//把引号中间的那部分加入到新容器
		builder.append(path);
		//把第二个引号之后的内容中的空格也替换掉#
		builder.append(content.substring(end).replace(" ", "#"));
		
		//输出
		System.out.println("替换后的字符串为:");
		System.out.println(builder.toString());
		
		//把\n后面的字符串取出
		String formatStr = content.substring(content.lastIndexOf("\n") + 1);
		System.out.println(formatStr);
		
		//把最后一行的内容进行切割(以:作为切割符,得到一个字符串数组)
		String[] result = formatStr.split(":");
		//迭代
		System.out.println("切割结果如下:");
		for(String s : result){
			System.out.println(s);
		}
	}
}
