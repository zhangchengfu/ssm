package com.laozhang.corejava.day14;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @描述 后缀名过滤器
 * @日期 May 15, 2013 10:45:28 AM
 * @作者 JSD1304
 */
public class SuffixFilter implements FilenameFilter{
	private String suffix;
	
	public SuffixFilter(String suffix) {
		this.suffix = suffix;
	}

	public boolean accept(File dir,String pathname) {
		File temp = new File(dir,pathname);
		if(temp.isDirectory()){
			return true;
		}else if(pathname.endsWith(suffix)){
			return true;
		}
		return false;
	}
}
