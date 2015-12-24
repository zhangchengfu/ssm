package com.laozhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/showUser", method = RequestMethod.GET)
	public ModelAndView getUser(@RequestParam int id) {
		ModelAndView modeAndView = new ModelAndView();
		User user = service.getUserById(id);
		modeAndView.addObject("user", user);
		modeAndView.setViewName("/showUser");
		//System.out.println("userName:" + user.getUserName());
		return modeAndView;
	}
	
	/**
	 * 保存
	 * @param user
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public void add(@RequestBody User user) {
		service.addUser(user);
	}
	
	/**
	 * 更新
	 * @param user
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public void updateUser(@RequestBody User user) {
		service.updateUser(user);
	}
	
	/**
	 * 删除
	 * @param id
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUser(@PathVariable int id) {
		service.deleteUser(id);
	}
}
