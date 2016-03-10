package com.laozhang.corejava.interview;

public class MathCalcute {

	public static void main(String[] args) {
		MathCalcute mc = new MathCalcute();
		// mc.printFibonacci(2);
		mc.printFibo(10);
	}

	public void printFibonacci(int pos) {
		// ���ж�
		if (pos == 1) {
			System.out.print("1");
			return;
		}
		if (pos == 2) {
			System.out.print("1,1");
			return;
		}
		// ����һ��long�͵�����
		long[] fibo = new long[pos];
		// ��ʼ����1���͵�2��λ��
		fibo[0] = 1;
		fibo[1] = 1;
		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		// ֻ�����
		for (int i = 0; i < fibo.length; i++) {
			System.out.printf("%d", fibo[i]);
			// ���,
			if (i != fibo.length - 1)
				System.out.print(",");
		}
		// ����
		System.out.println();
	}

	// ���õݹ������� �Ʋ���������
	public long fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1L;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// ��ӡ���
	public void printFibo(int pos) {
		for (int i = 1; i <= pos; i++) {
			System.out.printf("%d", fibonacci(i));
			if (i != pos) {
				System.out.print(',');
			}
		}
		System.out.println();
	}
}
