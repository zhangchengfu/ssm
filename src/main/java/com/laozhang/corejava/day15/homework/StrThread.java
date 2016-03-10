package com.laozhang.corejava.day15.homework;

public class StrThread extends Thread {

	@Override
	public void run(){
		for(char c='A';c<='Z';c++){
			System.out.print(c);
			try {
				sleep(601);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
