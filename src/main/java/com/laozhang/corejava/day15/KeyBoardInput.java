package com.laozhang.corejava.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @描述 键盘获取(非Scanner)
 * @日期 May 16, 2013 9:58:41 AM
 * @作者 JSD1304
 */
public class KeyBoardInput {
	public static void main(String[] args) {
		//通过BufferedReader来构建标准输入流
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//定义变量
		String line = null;
		try {
			//循环
			while(true){
				System.out.println("请输入:");
				line = br.readLine();//阻塞方法
				//判断退出
				if(line.equals("EXIT")){
					System.out.println(":)谢谢使用!");
					break;
				}
				//直接打印
				System.out.println("您刚才输入的内容为:" + line);
			}
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
