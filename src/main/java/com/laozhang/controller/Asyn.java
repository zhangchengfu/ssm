package com.laozhang.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.laozhang.asyn.AsynService;
/**
 * 异步
 * @author Lenovo
 *
 */
@RequestMapping("/asyn")
@Controller
public class Asyn {
	
	@Autowired
	private AsynService service;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String asynTest() {
		String ret = "ok";
		System.out.println("开始调用异步方法" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		service.test();
		System.out.println("结束调用异步方法" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		return ret;
	}
}
