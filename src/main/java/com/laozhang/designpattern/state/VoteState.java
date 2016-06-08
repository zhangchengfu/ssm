package com.laozhang.designpattern.state;

public interface VoteState {
	
	/**
	 * 处理状态的行为
	 * @param user 投票人
	 * @param voteItem	投票项
	 * @param voteManager	投票上下文，用来实现状态对应的功能处理的时候，可以回调上下文的数据
	 */
	public void vote(String user, String voteItem, VoteManage voteManager);
}
