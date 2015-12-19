package com.laozhang.scheduler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 定时
 * @author Lenovo
 *
 */
@RequestMapping("/scheduler")
@Controller
public class SchedulerController {
	
	public static int count = 1;
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public void test() {
		System.out.println("******************************************" + count + "******************************************");
		count++;
	}
}
