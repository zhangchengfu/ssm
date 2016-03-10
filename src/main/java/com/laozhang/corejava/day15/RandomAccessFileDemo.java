package com.laozhang.corejava.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @描述 本类用来演示随机访问存取流RandomAccessFile
 * 读取某一个文件的最后一行内容
 * 注:此文件是一个超大型的文件(GB等级)
 * @日期 May 16, 2013 10:42:27 AM
 * @作者 JSD1304
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) {
		RandomAccessFileDemo demo = new RandomAccessFileDemo();
		String line = demo.readLastLine("F:\\IO\\CoreJava\\day14笔记.txt");
		System.out.println("---最后一行文件内容为:");
		System.out.println(line);
	}
	
	/**
	 * 本方法可以去读文件的最后一行信息
	 */
	public String readLastLine(String filepath) {
		//根据文件路径构建File对象
		File file = new File(filepath);
		//判断
		if(!file.exists()){
			System.err.println(filepath + ",不存在...");
			return null;
		}
		//创建RandomAccessFile
		RandomAccessFile raf = null;
		try {
			//初始化RandomAccessFile,以只读方式构建
			raf = new RandomAccessFile(file,"r");
			//从后往前移动计数器
			int size = 1;
			//得到文件大小
			long fileSize = raf.length();
			int len = -1;
			boolean eof = false;
			while(!eof){
				//得到倒数第二个位置
				long pos = fileSize - size++;
				System.out.println("当前文件指针为:" + pos);
				//读数据,先定位
				raf.seek(pos);
				len = raf.read();
				//判断结束
				switch (len) {
				case -1:
				case '\r':
				case '\n':
					//记录当前光标的位置
					raf.seek(pos + 1);//不包含换行符
					eof = true;
					break;
				}
			}
			//最后,读取数据,因为此时,文件指针就在最后一行的起始位置
			//String line = raf.readLine();
			String line = new String(raf.readLine().getBytes("ISO-8859-1"));
			return line;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
