package com.laozhang.corejava.day15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * @描述 桥接器的使用
 * @日期 May 16, 2013 10:26:52 AM
 * @作者 JSD1304
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) {
		String filepath = "F:\\IO\\Corejava\\day14笔记.txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					filepath), "GBK"));
			String line = null;
			while(true){
				line = br.readLine();
				if(line == null){
					break;
				}
				System.out.println(line);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
