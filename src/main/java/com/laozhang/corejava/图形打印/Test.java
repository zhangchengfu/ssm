package com.laozhang.corejava.图形打印;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n空心矩形:");
		ConsoleShape.rect(5,10);
		System.out.println("\n实心矩形:");
		ConsoleShape.solidRect(5,10);
		
		System.out.println("\n空心上三角(右):");
		ConsoleShape.upperTriangle(10,10,true);	
		System.out.println("\n空心上三角(左):");
		ConsoleShape.upperTriangle(10,10,false);
		System.out.println("\n实心上三角(右):");		
		ConsoleShape.solidUpperTriangle(10,10,true);	
		System.out.println("\n实心上三角(左):");
		ConsoleShape.solidUpperTriangle(10,10,false);
		
		System.out.println("\n空心下三角(左):");
		ConsoleShape.lowerTriangle(10,10,true);	
		System.out.println("\n空心下三角(右):");
		ConsoleShape.lowerTriangle(10,10,false);
		System.out.println("\n实心下三角(左):");		
		ConsoleShape.solidLowerTriangle(10,10,true);	
		System.out.println("\n实心下三角(右):");
		ConsoleShape.solidLowerTriangle(10,10,false);
		
		System.out.println("\n空心菱形:");
		ConsoleShape.diamond(20,20);
		System.out.println("\n实心菱形:");
		ConsoleShape.solidDiamond(20,20);
		System.out.println("\n九九乘法表：");
		ConsoleShape.multiTable();
		
		System.out.println("\n复杂图形示例:");
		ConsoleShape.complexShape(20,40);
		System.out.print("请按回车键退出\t");
		if(System.console().readLine().equals("")){
			System.exit(0);	
		}
		
	}
}
