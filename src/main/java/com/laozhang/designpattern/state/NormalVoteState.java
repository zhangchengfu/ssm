package com.laozhang.designpattern.state;
//具体状态类——正常投票
public class NormalVoteState implements VoteState {

	public void vote(String user, String voteItem, VoteManage voteManager) {
		// 正常投票，记录到投票记录中
		voteManager.getMapVote().put(user, voteItem);
		System.out.println("恭喜投票成功");
	}

}
