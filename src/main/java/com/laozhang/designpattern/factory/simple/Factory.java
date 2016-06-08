package com.laozhang.designpattern.factory.simple;

public class Factory {
	public static ICase getInstance(int a) {
		return new CaseA(a);
	}
	
	public static void main(String[] args) {
		ICase cas = Factory.getInstance(1);
	}
}
