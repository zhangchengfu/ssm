package com.laozhang.corejava.day03.homework;

/**
 * 1!=1 2!=2 3!=6 4!=24 5!=120 6!=720 7!=5040 8!=40320 9!=362880 10!=3628800
 * 
 * 输出最终结果： 1!+2!+3!+4!+5!+6!+7!+8!+9!+10!=4037913
 */
public class Factorial {
	public static void main(String[] args) {
		Factorial fc = new Factorial();
		fc.print();
	}

	// 计算阶乘的方法
	public long factorial(int num) {
		long sum = 1L;
		for (int i = num; i >= 1; i--) {
			sum *= i;
		}
		return sum;
	}
	
	//递归
	public long factorial2(int num) {
		if(num == 1){
			return 1;
		}else{
			return num * factorial2(num - 1);
		}
	}

	// 按照要求打印
	public void print() {
		long sum = 0L;// 保存总数
		String msg = "";
		for (int i = 1; i <= 10; i++) {
			long result = factorial2(i);
			sum += result;
			msg += (i + "!");
			if (i != 10) {
				msg += "+";
			}
			// 输出
			System.out.printf("%d!=%d\n", i, result);
		}
		System.out.println();
		//输出最终结果
		System.out.printf("%s = %d",msg,sum);
	}

}
