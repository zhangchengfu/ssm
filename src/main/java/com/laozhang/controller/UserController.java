package com.laozhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.laozhang.auth.Auth;
import com.laozhang.domain.User;
import com.laozhang.service.IUserService;

@Auth
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@RequestMapping(value = "/showUser", method = RequestMethod.GET)
	public ModelAndView getUser(@RequestParam int id) {
		ModelAndView modeAndView = new ModelAndView();
		User user = service.getUserById(id);
		modeAndView.addObject("user", user);
		modeAndView.setViewName("/showUser");
		//System.out.println("userName:" + user.getUserName());
		return modeAndView;
	}
}
