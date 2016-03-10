package com.laozhang.corejava.day03.homework;

public class AmazingNumber {
	public static void main(String[] args) {
		AmazingNumber am = new AmazingNumber();
		am.print8();
		System.out.println("--------------------------------");
		am.print9();
		System.out.println("--------------------------------");
		am.print88();
	}

	public void print8() {
		int total = 1;
		int base = 8;
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d + %d = %d\n", total, base, i, (total
					* base + i));
			total *= 10;
			total += (i + 1);
		}
	}

	public void print9() {
		int total = 1;
		int base = 9;
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d + %d = %d\n", total, base, (i + 1),
					(total * base + (i + 1)));
			total *= 10;
			total += (i + 1);
		}
	}

	public void print88() {
		int base = 9;
		int total = base;
		for (int i = 9; i > 1; i--) {
			System.out.printf("%d * %d + %d = %d\n", total, base, (i - 2),
					(total * base + (i - 2)));
			total *= 10;
			total += (i - 1);
		}
	}
}
