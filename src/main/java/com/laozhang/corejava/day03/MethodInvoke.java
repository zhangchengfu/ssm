package com.laozhang.corejava.day03;

import com.laozhang.corejava.util.InputDataUtil;


/**
 * 综合练习 方法的定义,循环,流程控制,API的使用
 */
public class MethodInvoke {
	public static void main(String[] args) {
		MethodInvoke mi = new MethodInvoke();
		mi.start();
	}

	// 业务方法,启动程序
	public void start() {
		while(true){
			// 打印界面
			printMenu();
			// 获取用户的选择
			int choice = InputDataUtil.inputInt("请您选择功能:");
			switch (choice) {
			case 1:
				int a1 = InputDataUtil.inputInt("请您输入一个整数:");
				String line1 = BinaryString(a1);
				System.out.printf("%d的二进制为:%s\n", a1, line1);
				break;
			case 2:
				int a2 = InputDataUtil.inputInt("请您输入第一个整数:");
				int b2 = InputDataUtil.inputInt("请您输入第二个整数:");
				int line2 = maxNumber(a2, b2);
				System.out.printf("%d和%d中较大的数为:%d\n", a2, b2, line2);
				break;
			case 3:
				int a3 = InputDataUtil.inputInt("请您输入第一个整数:");
				int b3 = InputDataUtil.inputInt("请您输入第二个整数:");
				int line3 = add(a3, b3);
				System.out.printf("%d + %d = %d\n", a3, b3, line3);
				break;
			case 4:
				int a4 = InputDataUtil.inputInt("请您输入一个整数:");
				double line4 = sq(a4);
				System.out.printf("%d的开根号结果为:%f\n", a4, line4);
				break;
			case 5:
				int a5 = InputDataUtil.inputInt("请您输入第一个整数:");
				int b5 = InputDataUtil.inputInt("请您输入第二个整数:");
				double line5 = mi(a5, b5);
				System.out.printf("%d的%d次方为:%f\n", a5, b5, line5);
				break;
			case 6:
				System.out.println("(:亲,谢谢使用~");
				System.exit(0);//强制退出虚拟机进程
			default:
				System.out.println("您的输入有误,请重新输入!");
				break;
			}
		}
	}

	/**
	 * 打印一个程序界面
	 */
	public void printMenu() {
		System.out.println("---CALC---");
		System.out.println("|1.求二进制|");
		System.out.println("|2.求最大值|");
		System.out.println("|3.求    和|");
		System.out.println("|4.求开根号|");
		System.out.println("|5.求指数幂|");
		System.out.println("|6.退    出|");
		System.out.println("-----------");
	}

	// 求二进制的方法
	public String BinaryString(int num) {
		return Integer.toBinaryString(num);
	}

	// 求最大值的方法
	public int maxNumber(int a, int b) {
		return Math.max(a, b);
	}

	// 求和的方法
	public int add(int a, int b) {
		return a + b;
	}

	// 求开根号的方法
	public double sq(int num) {
		return Math.sqrt(num);
	}

	// 求指数幂的方法
	public double mi(int a, int b) {
		return Math.pow(a, b);
	}
}
