package com.laozhang.corejava.day03;

public class Qiuzhishu {
	public static void main(String[] args) {
		for (int i = 2;i<=200;i++){
			if(zhishu(i)){
				System.out.print("\t"+i);
			}
		}
	}
	
	public static boolean zhishu(int num){
		boolean zhishu = true;
		for(int i = 2;i<Math.sqrt(num);i++){
			if(num % i == 0){
				 zhishu = false;
				break;
			}
		}
		return zhishu;
	}

}
