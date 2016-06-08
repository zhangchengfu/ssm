package com.laozhang.designpattern.state;

public class Client {
	public static void main(String[] args) {
		VoteManage vm = new VoteManage();
		for (int i = 0; i < 9; i++) {
			vm.vote("ul", "A");
		}
	}
}
