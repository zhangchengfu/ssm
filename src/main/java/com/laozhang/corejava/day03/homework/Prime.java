package com.laozhang.corejava.day03.homework;

public class Prime{

	public static void main(String[] args) {
		Prime p = new Prime();
		p.printPrime();
	}
	
	public void printPrime(){
		int count = 0;//设置计数器
		for(int i=2;i<=200;i++){
			if(isPrime(i)){
				// 输出
				System.out.printf("%-4d",i);
				count ++;
				if(count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
	//用来检测输入的数字是否是质数
	public boolean isPrime(int num){
		//定义标记
		boolean isPrime = true;
		//判断是否是素数
		for (int i = 2; i <= Math.sqrt(num);i++) {
			if(num % i == 0) {
				//这个数不是素数
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}

