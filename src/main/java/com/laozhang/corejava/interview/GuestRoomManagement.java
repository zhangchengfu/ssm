package com.laozhang.corejava.interview;


import java.util.Scanner;

public class GuestRoomManagement {
	public static void main(String[] args) {
		String ary[][] = new String[10][12];
		System.out.println("��ӭ����ĳĳ�Ƶ�");
		boolean check = true;
		while (check) {
			System.out.println("=================");
			System.out.println("ser:����" + "\n" + "in:��ס" + "\n" + "out:�˷�"
					+ "\n" + "exit:�˳�ϵͳ");
			System.out.println("=================");
			Scanner sc = new Scanner(System.in);
			System.out.print("����������:");
			String str = sc.next();
			if (str.equals("ser")) {
				for (int a = 0; a < ary.length; a++) {
					for (int b = 0; b < ary[a].length; b++) {
						System.out.print(ary[a][b] + "\t");
					}
					System.out.println();
				}
			} else if (str.equals("in")) {
				boolean index = true;
				while (index) {
					System.out.print("�����뷿���:");
					int i = sc.nextInt();
					if ((i % 100 > 0 && i % 100 <= 12)
							&& (i / 100 > 0 && i / 100 <= 10)) {
						boolean dex = true;
						while (dex) {
							if ((ary[i / 100][i % 100]) == null) {
								System.out.print("�������������:");
								String name = sc.next();
								ary[i / 100][i % 100] = name;
								System.out.println(name + "��ס" + i + "�ŷ���");
								index = false;
								dex = false;
							} else {
								System.out.println("�������������ס��!");
								break;
							}
						}
					} else {
						System.out.println("û�и÷����!");
					}
				}
			} else if (str.equals("out")) {
				boolean dex = true;
				while (dex) {
					System.out.print("�����뷿���:");
					int i = sc.nextInt();
					if ((i % 100 > 0 && i % 100 <= 12)
							&& (i / 100 > 0 && i / 100 <= 10)) {
						// if ((ary[i / 100][i % 100])==null){
						// System.out.println("�÷��䱾���ǿշ�,�����˷�!!!");
						// }else{//���ﲻ�����˵ķ����Ƿ�����
						ary[i / 100][i % 100] = null;
						System.out.println(i + "�������˷�,��ӭ�´ι���!");
						dex = false;
						// }
					} else {
						System.out.println("û�и÷����");
					}
				}
			} else if (str.equals("exit")) {
				System.out.println("�������˳�,ллʹ��!");
				check = false;
			} else {
				System.out.println("�����������");
			}
		}
	}
}
