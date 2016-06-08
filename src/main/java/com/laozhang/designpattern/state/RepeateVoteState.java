package com.laozhang.designpattern.state;
//具体状态类-重复投票
public class RepeateVoteState implements VoteState {

	public void vote(String user, String voteItem, VoteManage voteManager) {
		// 重复投票，暂时不做处理
		System.out.println("请不要重复投票");

	}

}
