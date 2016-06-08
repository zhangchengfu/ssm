package com.laozhang.designpattern.chain;
//具体请求类02
public class Request02 extends AbstractRequest {

	public Request02(String content) {
		super(content);
	}

	@Override
	public int getRequestLevel() {
		return Levels.LEVEL_02;
	}

}
