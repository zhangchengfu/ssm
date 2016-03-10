package com.laozhang.corejava.interview;

import java.util.*;


public class 大乐透摇奖 {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		Random rand = new Random();
		while (list1.size() < 5) {
			Integer result = new Integer((Math.abs(rand.nextInt() % 35)) + 1);
			if (!list1.contains(result)) {
				list1.add(result);
			}
		}
		System.out.println("红球:" + list1.toString());

		while (list2.size() < 2) {
			Integer result = new Integer((Math.abs(rand.nextInt() % 12)) + 1);
			if (!list2.contains(result)) {
				list2.add(result);
			}
		}
		System.out.println("蓝球:" + list2.toString());
	}
}