package com.laozhang.corejava.day15.homework;


public class IntThread extends Thread {
	
	@Override
	public void run(){
		for(int i=1;i<=26;i++){
			System.out.print(i*2-1);
			System.out.print(i*2);
			try {
				sleep(600);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
