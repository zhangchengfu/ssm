package com.laozhang.corejava.day09.homework;

public class Play1 implements Player {

	public String getName() {
		return "鼠";
	}
	public String show() {
		String s = "";
		int i = (int)(Math.random()*3);
		if(i==0){
			s = "剪刀";
		}else if(i ==1){
			s =  "石头";
		}else if(i == 2){
			s = "布";
		}
		return s;
	}
}
