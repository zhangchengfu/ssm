package com.laozhang.corejava.day15.线程案例;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class 即时写入文件内容 {
	public static void main(String[] args) throws IOException {
		String file = "F:\\test.txt";
		final PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file),"utf-8"));
		final LinkedList<String>buf = new LinkedList<String>();
		final Thread writer = new Thread(){
			public void run(){
				while(true){
					if(buf.isEmpty()){
						System.out.println("等待用户输入内容:");
						try{
						    Thread.sleep(10000);
						    continue;
						}catch(InterruptedException e){
							e.printStackTrace();
				            System.out.println("软件要结束了!");
				            continue;
						}
					}
					String str = buf.removeFirst();
					System.out.println("成功写入:"+str); 
					out.println(str);
			        out.flush();
				}
			}
		};
		final Thread reader = new Thread(){
			public void run(){
				Scanner console = new Scanner(System.in);
				while(true){
					String str = console.nextLine();
					buf.addLast(str);
					if(str.equalsIgnoreCase("quit")){
						writer.interrupt();
						break;
					}
				}
				System.out.println("~再见~");
			}
		};
		writer.setDaemon(true);
	    writer.start();
	    reader.start();
	}
}	
		