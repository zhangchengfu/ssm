package com.laozhang.corejava.day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @描述 本类用来演示文件复制
 * @日期 May 15, 2013 1:36:06 PM
 * @作者 JSD1304
 */
public class FileCopy {
	/**
	 * 文件复制的方法
	 */
	public static void copy(String src, String target) {
		// 根据路径来创建源头File实例
		File srcFile = new File(src);
		if (srcFile.isDirectory()) {
			System.out.println("本方法暂时不支持目录拷贝!");
			return;
		}
		// 定义目标File实例
		File targetFile = new File(target);
		if (targetFile.isDirectory()) {
			System.out.println("本方法暂不支持拷贝文件到目录中!");
			return;
		}
		// 执行copy
		copy(srcFile, targetFile);
	}

	// 真正执行复制的方法
	public static void copy(File srcFile, File targetFile) {
		// 根据源头和目标创建输入,输出流
		// FileInputStream fis = null;
		// FileOutputStream fos = null;

		// 带缓存的输入,输出流
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		// 初始化
		try {
			bis = new BufferedInputStream(new FileInputStream(srcFile));
			bos = new BufferedOutputStream(new FileOutputStream(targetFile));
			// 获取源文件的总大小
			int size = bis.available();
			// 定义变量:用来保存实际读取多少个字节数
			int len = -1;

			// 设置缓存大小为100K
			byte[] buf = new byte[100 * 1024];

			// 定义变量用来保存总字节数
			double total = 0.0;

			// 循环读取
			while (true) {
				// 1.先读
				len = bis.read(buf);
				// 判断是否读到文件尾部
				if (len == -1) {
					break;
				}
				// 2.写入到目标文件中
				bos.write(buf, 0, len);
				total += len;
				System.out.printf("已完成[%4.2f%%]bytes.\r", total / size * 100);
			}
			// 完成复制提示
			System.out.printf("\n拷贝完成,共计[%.0f]bytes.\n", total);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭流,释放资源
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
