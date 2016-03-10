package com.laozhang.corejava.文件工具类;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;

public class IOUtils {

	// 拆分文件
	public static void split(String file, int size) {
		try {
			InputStream in = new FileInputStream(file);
			int index = 0;
			DecimalFormat fmt = new DecimalFormat("000");
			String ext = fmt.format(index++);
			String filename = file + "." + ext;
			OutputStream out = new FileOutputStream(filename);
			byte[] buf = new byte[1024];
			int count;
			int n = 0;
			while ((count = in.read(buf)) != -1) {
				out.write(buf, 0, count);
				n++;
				if (n % size == 0) {
					out.close();
					ext = fmt.format(index++);
					filename = file + "." + ext;
					out = new FileOutputStream(filename);
				}
			}
			out.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	// 合并文件
	public static void join(String file) {
		try {
			int dot = file.lastIndexOf(".");
			String outFile = file.substring(0, dot);
			int index = 0;
			DecimalFormat fmt = new DecimalFormat("000");
			String ext = fmt.format(index++);
			String inFile = outFile + "." + ext;
			InputStream in = new FileInputStream(inFile);
			OutputStream out = new FileOutputStream(outFile);
			int count;
			byte[] buf = new byte[1024];
			while (true) {
				while ((count = in.read(buf)) != -1) {
					out.write(buf, 0, count);
				}
				in.close();
				ext = fmt.format(index++);
				inFile = outFile + "." + ext;
				File f = new File(inFile);
				if (!f.exists()) {
					break;
				}
				in = new FileInputStream(inFile);
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	// 复制文件
	public static void cp(String src, String dst) {
		try {
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst);
			byte[] buf = new byte[1024];// 缓冲区
			int count;
			while ((count = in.read(buf)) != -1) {
				out.write(buf, 0, count);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	// 打印文件
	public static void print(String file) {
		try {
			InputStream in = new FileInputStream(file);
			int b;
			int i = 1;
			while ((b = in.read()) != -1) {
				if (b <= 0xf) {
					System.out.print("0");
				}
				System.out.print(Integer.toHexString(b) + " ");
				if (i++ % 16 == 0) {
					System.out.println();
				}
			}
			in.close();
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	// 在内存中实现序列化和反序列化
	public static Object deepCopy(Object obj) {
		try {
			ByteArrayOutputStream buf = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(buf);
			out.writeObject(obj);
			out.close();
			byte[] data = buf.toByteArray();
			ByteArrayInputStream ary = new ByteArrayInputStream(data);
			ObjectInputStream in = new ObjectInputStream(ary);
			Object o = in.readObject();
			in.close();
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
