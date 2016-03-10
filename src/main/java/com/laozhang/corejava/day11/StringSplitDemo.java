package com.laozhang.corejava.day11;

/**
 * @描述 字符串切割
 * @日期 May 10, 2013 2:27:37 PM
 * @作者 JSD1304
 */
public class StringSplitDemo {
	public static void main(String[] args) {
		StringSplitDemo demo = new StringSplitDemo();
		String str = "foo:abccc:dooo:efffe:ooo";
		//demo.printSplitString(str, ":", 0);//按照:来全部切割
		//demo.printSplitString(str, ":", 3);//按照:来切割三段,之后的模式就不起作用
		//demo.printSplitString(str, "o", 0);//切割结束末尾没有空字符串
		//demo.printSplitString(str, "o", -2);//切割结束末尾留下空字符串
		//demo.printSplitString(str, "o", 2);
		demo.printSplitString(str, "o+", 0);
	}

	// 把指定的字符串,采用split()切割,并且打印出来
	public void printSplitString(String str, String pattern, int limit) {
		// 参数有效性判断
		if (str == null || str.trim().length() == 0) {
			System.err.println("参数不能为空或者不能为空白字符串");
			return;
		}
		// 调用split()切割方法
		String[] result = str.split(pattern, limit);
		System.out.printf("===[%s]采用模式字符[%s],limit[%d]次的结果为:===\n", str,
				pattern, limit);
		//遍历数组
		for(int i = 0;i < result.length;i++){
			System.out.printf("result[%d] = %s\n",i,result[i]);
		}
	}
}
