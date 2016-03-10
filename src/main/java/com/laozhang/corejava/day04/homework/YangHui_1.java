package com.laozhang.corejava.day04.homework;

public class YangHui_1 {

	public static void main(String[] args) {
		YangHui_1 yh = new YangHui_1();
		int Num = 6;
		for (int i = 0; i < Num; i++) {//����
			for (int j = 0; j <= i; j++) {//����
				System.out.print(yh.get(i, j) + "\t");
			}
			System.out.println();
		}
	}

	//�ݹ����
	public int get(int x, int y) {
		if (y == 0 || x == y){
			return 1;
		}else{
			return get(x - 1, y - 1) + get(x - 1, y);
		}
	}
}
