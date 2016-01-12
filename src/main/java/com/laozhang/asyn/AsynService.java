package com.laozhang.asyn;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsynService {
	/**
	 * 异步执行
	 */
	@Async
	public void test() {
		System.out.println("休眠开始");
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("休眠结束");
	}
}
