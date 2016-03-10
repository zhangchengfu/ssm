package com.laozhang.corejava.day03;

import com.laozhang.corejava.util.InputDataUtil;


/**
 * 本类用来返回某年某月一共有多少天
 */
public class SwitchCaseDemo2 {
	public static int getMonthDay(){
		for(;;){
			int year = InputDataUtil.inputInt("请您输入年份:");
			if(year < 0){
				System.out.println("对不起,您的输入有误!");
			}else{
				int month = InputDataUtil.inputInt("请您输入月份:");
				switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.printf("%d年%d月有31天.\n",year,month);
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.printf("%d年%d月有30天.\n",year,month);
					break;
				case 2:
					if((year % 4 == 0&&year % 100 !=0)|| (year % 400 == 0)){
						System.out.printf("%d年%d月有29天.\n",year,month);
					}else{
						System.out.printf("%d年%d月有28天.\n",year,month);
					}
				default:
					System.out.println("对不起,您的输入有误!");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		getMonthDay();
	}
}

