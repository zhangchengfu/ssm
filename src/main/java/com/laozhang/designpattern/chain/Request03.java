package com.laozhang.designpattern.chain;
//具体请求类03
public class Request03 extends AbstractRequest {

	public Request03(String content) {
		super(content);
	}

	@Override
	public int getRequestLevel() {
		return Levels.LEVEL_03;
	}

}
