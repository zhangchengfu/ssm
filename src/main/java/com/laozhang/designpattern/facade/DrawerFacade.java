package com.laozhang.designpattern.facade;

public class DrawerFacade {
	private DrawerOne drawerOne = new DrawerOne();
	private DrawerTwo drawerTwo = new DrawerTwo();
	
	public void open () {
		drawerOne.open();
		drawerTwo.open();
	}

	public static void main(String[] args) {
		DrawerFacade facade = new DrawerFacade();
		facade.open();
	}
}
