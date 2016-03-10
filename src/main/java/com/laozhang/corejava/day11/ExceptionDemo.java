package com.laozhang.corejava.day11;

import java.util.Scanner;

/**
 * @描述 本类用来演示异常
 * @日期 May 10, 2013 1:45:24 PM
 * @作者 JSD1304
 */
public class ExceptionDemo {

	public int divide(Integer d1, Integer d2) throws DivideNotZero {
		if (d1 == null || d2 == null) {
			// 抛出一个异常
			NullPointerException npe = new NullPointerException("对象为空!");
			// Exception ex = new Exception("对象为空!");
			// 抛出此异常
			throw npe;
		}
		if (d2.intValue() == 0) {
			// 重新抛出一个除数不为0的异常(自定义异常)(非运行时异常)
			DivideNotZero dnz = new DivideNotZero("除数不能为0!");
			throw dnz;
		}
		return d1 / d2;
	}
	
	//获取用户输入的方法
	public int inputData(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		//为了达到用户只能输入数字的目的,此处做异常处理
		int result = 0;
		try{
			result = sc.nextInt();
		}catch(RuntimeException e){
			//做异常处理
			System.err.printf("期望您输入的是数字,而得到的是%s.\n",sc.nextLine());
			//重新给用户输入
			return inputData(msg);
		}
		return result;
	}
	
	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		Integer d1 = new Integer(ed.inputData("请您输入被除数:"));
		Integer d2 = new Integer(ed.inputData("请您输入除数:"));
		try {
			int d = ed.divide(d1, d2);
			//输出结果
			System.out.println(d);
			//System.exit(0);
		} catch (DivideNotZero e) {
			e.printStackTrace();//打印出异常堆栈信息
		} catch (ArithmeticException e) {
			//把异常信息写入到日志中
			System.out.println("异常信息为:" + e.getMessage());
		} finally {
			//finally块中的代码会被最后执行
			//除非上面有System.exit(0);
			System.out.println("---finally---");
		}
	}
}
