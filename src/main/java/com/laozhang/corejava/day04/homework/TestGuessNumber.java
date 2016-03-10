package com.laozhang.corejava.day04.homework;

import java.util.Scanner;

public class TestGuessNumber {
	public static void main(String[] args) {
		TestGuessNumber tg = new TestGuessNumber();
		tg.play();
	}
	
	//负责游戏的方法
	public void play(){
		GuessNumber gn = new GuessNumber((int) (Math.random() * 100 + 1), 1,
				100, 0);
		Scanner sc = new Scanner(System.in);
		System.out.print("\t\t==== 猜数字游戏 ====\n\n");
		System.out.print("\t\t请输入你猜的数字(1~100):");
		while(true){
			int guess = sc.nextInt();
			String msg = "";
			gn.setTimes(gn.getTimes() + 1);
			if(guess < gn.getRandomNumber()){
				gn.setStart(guess);
				msg = "太小了";
				
			}else if(guess > gn.getRandomNumber()){
				gn.setEnd(guess);
				msg = "太大了";
			}else{
				System.out.println("\t\t哈哈哈,你中了.");
				break;//跳出while循环
			}
			//输出新提示
			System.out.printf("\t\t%s,请输入你猜的数字(%d~%d):",msg,gn.getStart(),gn.getEnd());
		}
		
		//输出最终结果
		System.out.printf("\t\t生成的随机是%d,你总共猜了%d次.",gn.getRandomNumber(),gn.getTimes());
	}
}
