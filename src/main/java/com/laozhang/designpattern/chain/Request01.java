package com.laozhang.designpattern.chain;
//具体请求类01
public class Request01 extends AbstractRequest {

	public Request01(String content) {
		super(content);
	}

	@Override
	public int getRequestLevel() {
		return Levels.LEVEL_01;
	}

}
