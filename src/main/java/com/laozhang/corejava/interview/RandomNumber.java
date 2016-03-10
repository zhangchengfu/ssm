package com.laozhang.corejava.interview;

import java.util.BitSet;
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		RandomNumber rn = new RandomNumber();
		rn.method_1();
		//rn.method_2();
	}

	public void method_1() {
		int[] randomNums = new int[10000000];
		Random random = new Random();
		for (int i = 0, length = randomNums.length; i < length; i++) {
			randomNums[i] = random.nextInt(100000000);
		}
		long start = System.currentTimeMillis();
		boolean[] bitArray = new boolean[100000000];
		for (int i = 0, length = randomNums.length; i < length; i++) {
			bitArray[randomNums[i]] = true;
		}
		for (int i = 0, length = bitArray.length; i < length; i++) {
			if (bitArray[i]) {
				continue;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��: " + (end - start));
	}

	public void method_2() {
		BitSet bs = new BitSet(100000000);
		int[] data = new int[10000000];
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			bs.set(data[i], true);
		}
		for (int i = 0; i < 100000000; i++) {
			if (!bs.get(i)) {
				continue;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��: " + (end - start));
	}
}
