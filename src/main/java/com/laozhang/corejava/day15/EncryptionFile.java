package com.laozhang.corejava.day15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*************
 * 加密文件
 * @author YaoWei
 * @日期   Nov 26, 2012 10:40:48 AM
 * @since  JDK1.0
 * @包名   com.corejava.day15
 * @文件名 EncryptionFile.java
 *
 */
public class EncryptionFile {

	public void encryptFile(String str, String dest){
		BufferedReader br = null;
		PrintWriter pw =null;
		System.out.println("正在加密....");
		try {
			br = new BufferedReader(
					new FileReader(str));
			pw = new PrintWriter(dest);
			//循环读,加密,写
			String line = null;
			while(true){
				line = br.readLine();
				if(line == null){
					break;
				}
				//处理业务
				line = entrypt(line);
				
				//写到输出流中
				pw.println(line);
				
			}
			System.out.println("加密完成...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
		}
	}

	private String entrypt(String line) {
		byte[] srcBytes = line.getBytes();
		final int BASE = 0xf;
		for(int i =0;i<srcBytes.length;i++){
			srcBytes[i] = (byte)(srcBytes[i]^BASE);
		}
		return new String(srcBytes);
	}
	
	public static void main(String[] args) {
		EncryptionFile ef = new EncryptionFile();
		String src = "d:\\接受文件\\新建文件夹\\新建文件夹\\day14\\day14笔记.txt";
		String dest = "d:\\接受文件\\新建文件夹\\新建文件夹\\day14\\day14笔记2.txt";
		ef.encryptFile(src, dest);
	}
}
