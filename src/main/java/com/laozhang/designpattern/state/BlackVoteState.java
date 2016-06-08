package com.laozhang.designpattern.state;
//具体状态类——黑名单
public class BlackVoteState implements VoteState {

	public void vote(String user, String voteItem, VoteManage voteManager) {
		// 记录黑名单中，禁止登录系统
		System.out.println("进入黑名单，将禁止登录和使用本系统");
	}

}
