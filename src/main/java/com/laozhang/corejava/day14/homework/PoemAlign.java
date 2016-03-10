package com.laozhang.corejava.day14.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/*************************
 * 古诗竖排
 */
public class PoemAlign {

	public static void main(String[] args) {
		PoemAlign pa = new PoemAlign();
		pa.printPoem(
				"C:\\Workspaces\\MyEclipse 10-Teach\\CoreJavaTeach\\src\\com\\corejava\\day14\\homework\\诗.txt",
						6);
	}

	public void printPoem(String filepath, int numPerCol) {
		File file = new File(filepath);
		if (!file.exists() || file.isDirectory()) {
			System.err.println(filepath + " 不存在或是目录.");
			return;
		}
		// 把此文件中的所有数据加载到StringBuilder中去
		BufferedReader br = null;
		StringBuilder builder = new StringBuilder();
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader(file));
			pw = new PrintWriter(new File(file.getParentFile(), "竖排诗.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				builder.append(line);
			}
			System.out.println(builder.toString());
			// 下面写一个方法来处理这个字符串
			String result = verticalAlign(builder.toString(), numPerCol);
			System.out.println("=== 竖排后 =====================");
			System.out.println(result);
			// pw.print(result);
			pw.println(result);
			pw.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
		}
	}

	private String verticalAlign(String poem, int numPerCol) {
		int total = poem.length();
		// 求出行和列 数
		int rows = numPerCol > total ? total : numPerCol;
		int cols = total % rows;
		cols = (cols == 0 ? total / rows : total / rows + 1);

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i + j * rows < total) {
					builder.append(poem.charAt(i + j * rows));
				} else {
					builder.append("~");
				}
			}
			// 加入换行符
			builder.append('\r');
		}
		return builder.toString();
	}
}
