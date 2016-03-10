package com.laozhang.corejava.day14.IO案例;

import java.util.Arrays;

import com.laozhang.corejava.文件工具类.IOUtils;

public class 深层浅层复制对比 {
	public static void main(String[] args) {
		String[] ary1 = { "A", "B" };
		System.out.println("浅层复制:");
		String[] ary2 = Arrays.copyOf(ary1, ary1.length);
		System.out.println(ary1 == ary2);
		System.out.println(Arrays.equals(ary1, ary2));
		System.out.println(ary1[0] == ary2[0]);

		System.out.println("深层复制:");
		String[] arg3 = (String[]) IOUtils.deepCopy(ary1);
		System.out.println(ary1 == arg3);
		System.out.println(Arrays.equals(ary1, arg3));
		System.out.println(ary1[0] == arg3[0]);
	}
}
