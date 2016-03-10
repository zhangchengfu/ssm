package com.laozhang.corejava.day07.homework;

import java.util.Scanner;

/************************
 * 封装猜数字类,包含如下方法: 开始游戏的方法 结束游戏的方法 从键盘输入数据的方法(含提示) 输出结果的方法 ...
 * 
 * @author Administrator
 * 
 */
public class GuessNumber {

	// 属性
	private static int random;
	// 范围数,默认是100
	private int base = 100;
	// 最小值, 默认为1
	private int start = 1;
	// 最大值,默认与base 一样
	private int end = base;

	// 猜测的时长
	private long duration;

	// 记录游戏是否结束
	private boolean gameover;

	private Scanner scanner;
	// 用户所选
	private int select;
	// 提示
	private String message;

	private int count = 1;

	private int historyLength;
	private int[] geussTimes;

	public GuessNumber(int base, int historyLength) {
		this.base = base;
		this.historyLength = historyLength;
		this.geussTimes = new int[this.historyLength];
		scanner = new Scanner(System.in);
	}

	// 猜数字
	public GuessNumber() {
		// 初始化数据
		this.historyLength = 10;
		this.geussTimes = new int[this.historyLength];
		scanner = new Scanner(System.in);
	}

	// 产生随机数
	private void generateRandom() {
		random = (int) (Math.random() * base) + 1;
	}

	/*********
	 * 开始游戏的方法
	 * 
	 */
	public void begin() {
		do {
			// 打印菜单
			printMenu();
			// 产生随机数
			generateRandom();
			// 提示用户输入
			select = inputData();

			switch (select) {
			case 1:
				start();
				break; // 退出 case 1;
			case 2:
				viewHistory();
				break;
			case 3:
				end();
				break;
			case 4:
				help();
				break;
			default:
				System.out.println("输入有误.请重新选择[1~3]");
			}

		} while (!gameover);
	}

	private void start() {
		// TODO Auto-generated method stub
		System.out.println("\t#开始游戏....");
		do {
			int number = inputData();
			if (number > random) {
				message = "太大了!";
				end = number;
				count++;
			} else if (number < random) {
				message = "太小了!";
				start = number;
				count++;
			} else { // 表示猜对了
				message = "哈哈哈,你猜对了!";
				System.out.printf("\t%s,你总共猜了%d次.\n", message, count);
				break;
			}
			System.out.printf("\t%s,范围是[%d - %d]\n", message, start, end);
		} while (true);
	}

	// 查看历史记录
	private void viewHistory() {
		// TODO Auto-generated method stub
		System.out.println("暂无数据.");
	}

	// 帮助
	private void help() {
		// TODO Auto-generated method stub
		System.out.println("\t#帮助文档\t\t#");
		System.out.println("\t#命令1 表示开始游戏");
		System.out.println("\t#命令2 表示退出游戏");
		System.out.println("\t#当用户所猜的数字比目标数小时,系统会提示<太小了>");
		System.out.println("\t#当用户所猜的数字比目标数大时,系统会提示<太大了>");
		System.out.println("\t#当用户所猜的数字与目标数相同时,系统会提示<恭喜你,答对了!>");
	}

	/**************
	 * 结束游戏的方法
	 */
	public void end() {
		System.out.println("谢谢使用.");
		gameover = true;
	}

	/******************************
	 * 打印菜单
	 */
	public void printMenu() {
		System.out.println("\t#########################################");
		System.out.println("\t##欢迎进入猜数字游戏(请选择相关操作进入)\t#");
		System.out.println();
		System.out.println("\t##-1.开始游戏\t\t\t\t#");
		System.out.println("\t##-2.查看记录\t\t\t\t#");
		System.out.println("\t##-3.退出游戏\t\t\t\t#");
		System.out.println("\t##-4.阅读帮助\t\t\t\t#");
		System.out.println();
		System.out.println("\t#########################################");
	}

	public int inputData() {
		System.out.print("请输入>: ");
		int input = scanner.nextInt();
		return input;
	}

	public static void main(String[] args) {
		GuessNumber gn = new GuessNumber();
		gn.begin();
	}
}
