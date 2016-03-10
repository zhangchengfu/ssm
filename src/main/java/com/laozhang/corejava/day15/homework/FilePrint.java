package com.laozhang.corejava.day15.homework;

public class FilePrint {

	public static void main(String[] args) {
		IntThread it = new IntThread();
		StrThread st = new StrThread();
		it.start();
		try {
			Thread.sleep(320);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		st.start();
	}
}
