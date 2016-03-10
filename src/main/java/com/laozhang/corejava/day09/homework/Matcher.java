package com.laozhang.corejava.day09.homework;

public class Matcher {
	public static void match(Player p1, Player p2){
		String a = p1.show();
		String b = p2.show();
		
		if(a.equals(b)){
			System.out.printf("%s出%s和%s出%s,打成平手",p1.getName(), a,p2.getName(),b);
		}else if((a.equals(Player.BU))&&(b.equals(Player.SHITOU)) || (a.equals(Player.SHITOU))
				&&(b.equals(Player.JIANDAO)) || (a.equals(Player.JIANDAO)) && (b.equals(Player.BU))){
			System.out.printf("%s出%s,%s出%s,%s赢了",p1.getName(),a,p2.getName(),b,p1.getName());
		}else{
			System.out.printf("%s出%s,%s出%s,%s赢了",p1.getName(),a,p2.getName(),b,p2.getName());
		}
	}
}
