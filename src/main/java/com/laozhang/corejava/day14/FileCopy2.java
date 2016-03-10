package com.laozhang.corejava.day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @描述 本类用来演示文件复制
 * @日期 May 15, 2013 1:36:06 PM
 * @作者 JSD1304
 */
public class FileCopy2 {
	/**
	 * 文件复制的方法
	 */
	public static void copy(String src, String target) {
		File srcFile = new File(src);
		File targetFile = new File(target);
		copy(srcFile, targetFile);
	}

	public static void copy(File srcFile, File targetFile) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(srcFile));
			bos = new BufferedOutputStream(new FileOutputStream(targetFile));
			int len = -1;
			byte[] buf = new byte[100 * 1024];
			while (true) {
				len = bis.read(buf);
				if (len == -1) {
					break;
				}
				bos.write(buf, 0, len);
			}
			System.out.println("\n拷贝成功!\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
