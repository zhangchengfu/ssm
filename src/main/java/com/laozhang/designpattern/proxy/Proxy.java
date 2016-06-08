package com.laozhang.designpattern.proxy;

public class Proxy implements Subject {
	
	private Subject subject;
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}

	public void request() {
		// pre todo
		subject.request();
		
		//post todo

	}

}
