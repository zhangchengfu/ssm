package com.laozhang.corejava.day14;

import java.io.File;
import java.io.IOException;

/**
 * @描述 java.io.File类演示
 * @日期 May 15, 2013 9:49:28 AM
 * @作者 JSD1304
 */
public class FileDemo {
	/**
	 * 新建一个文件夹
	 */
	public void newFolder(String folderName){
		//根据文件名构建File实例
		File folder = new File(folderName);
		//判断此文件夹是否存在
		if(!folder.exists()){
			//说明不存在,则创建文件夹结构
			boolean b = folder.mkdirs();
			if(b){
				System.out.printf("创建[%s]成功.\n",folder);
			}
		}else{
			//说明此文件夹已近存在
			System.out.printf("[%s]已近存在.\n",folder);
		}
	}
	/**
	 * 根据指定的路径来创建一个文件
	 */
	public void newFile(String fileName){
		//根据文件名字构建File实例
		File file = new File(fileName);
		//判断文件是否存在
		if(!file.exists()){
			//创建文件
			try {
				if(file.createNewFile()){
					System.out.printf("[%s]创建成功...\n",file);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}else{
			System.out.printf("文件[%s]已近存在...\n",file);
		}
	}
	
	/**
	 * 根据给定的目录,把这个目录下的所有文件和子文件目录列出来
	 */
	public void printFile(String filepath){
		//构建File对象
		File file = new File(filepath);
		//判断是否是目录
		if(file.isDirectory()){
			printFile(file);
		}
	}
	
	public void printFile(File file){
		//列举所有文件
		//File[] files = file.listFiles();
		//创建过滤器对象
		SuffixFilter sff = new SuffixFilter(".exe");
		//在构建Files数组的时候传入过滤器对象
		File[] files = file.listFiles(sff);
		for(File f : files){
			if(f.isDirectory()){
				//得到绝对路径
				System.out.println(f.getAbsolutePath());
				//递归调用用自己
				printFile(f);
			}else{
				//说明是文件
				System.out.println("\t" + f.getName());
			}
		}
	}
}
