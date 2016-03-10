package com.laozhang.corejava.day14.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import java.io.IOException;

public class Simulation {
	
	public void printCode(String filepath){
		InputStreamReader is=null;
		try {
			is=new InputStreamReader(new FileInputStream(filepath));
			while(true){
				int len=is.read();
				//判断结束
				if(len==-1){
					break;
				}
				char c=(char)len;
				//输出到控制台
				System.out.print(c);
				Thread.sleep((long) (Math.random()*300));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
