package com.laozhang.corejava.day14.IO案例;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class 输入流演示 {
	public static void main(String[] args) throws IOException {
		String file = "input.txt";
		InputStream in = new FileInputStream(file);
		int a;
		while ((a = in.read()) != -1) {
			System.out.print(Integer.toBinaryString(a) + " ");
		}
		System.out.println();
		in.close();

		in = new FileInputStream(file);
		int size = in.available();
		byte[] buf = new byte[size];
		int count = in.read(buf);
		System.out.println("count:" + count);
		System.out.println("buf:" + Arrays.toString(buf));
	}
}
