package com.laozhang.designpattern.chain;
//抽象请求类
public abstract class AbstractRequest {
	private String content = null;
	
	public AbstractRequest(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	//获得请求的级别
	public abstract int getRequestLevel();
}
