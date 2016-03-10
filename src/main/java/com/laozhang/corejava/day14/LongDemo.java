package com.laozhang.corejava.day14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

/**
 * @描述 利用DataInputStream/DataOutputStream
 *       来产生一个永不重复的长整型,这个数总100开始.
 * @日期 May 15, 2013 2:45:58 PM
 * @作者 JSD1304
 */
public class LongDemo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static final String FILEPATH = "E:\\123\\456.txt";
	
	
	public LongDemo() {
		generateGUID();
	}

	public long generateGUID() {
		long i = 100;
		try {
			i = readLong();
			writeLong(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public Long readLong() throws IOException{
		DataInputStream dis = null;
		long l = 100;
		try {
			dis = new DataInputStream(new FileInputStream(FILEPATH));
			
			//为了避免EOFException异常,意外读取文件尾部
			if(dis.available() == 0){
				//System.out.println("文件内容为空!");
				return l;//如果是空文件,直接初始化为100
			}
			l = dis.readLong();
			System.out.printf("读取数据成功[%d]...",l);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			dis.close();
		}
		return l;
	}
	
	public void writeLong(long value) throws IOException{
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(FILEPATH));
			//调用writeLong()方法写入数据
			dos.writeLong(value + 1);
			System.out.println("写入数据成功~");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			dos.close();
		}
	}
}
