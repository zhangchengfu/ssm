package com.laozhang.designpattern.state;
//具体状态类——恶意刷票
public class SpiteVoteState implements VoteState {

	public void vote(String user, String voteItem, VoteManage voteManager) {
		// 恶意投票，取消用户的投票资格，并取消投票记录
		String str = voteManager.getMapVote().get(user);
		if (str != null) {
			voteManager.getMapVote().remove(user);
		}
		System.out.println("你有恶意刷屏行为，取消投票资格");
	}

}
