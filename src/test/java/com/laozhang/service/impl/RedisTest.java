package com.laozhang.service.impl;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.laozhang.dao.IUserDtoDao;
import com.laozhang.domain.User;
import com.laozhang.dto.UserDto;
import com.laozhang.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml", "classpath:spring-mybatis.xml", "classpath:redis-context.xml"})
@Transactional
public class RedisTest {
	
	@Autowired
	private IUserDtoDao dao;
	
	@Autowired
	private IUserService service;
	
	@Test
	public void test() {
		User user = service.getUserById(2);
		UserDto dto = new UserDto();
		dto.setId(user.getId());
		dto.setToken(String.valueOf((new Date()).getTime()));
		dao.insertUserDto(String.valueOf(user.getId()), dto);
		UserDto target = dao.selectUserDto(String.valueOf(user.getId()));
		System.out.println("=================================================================");
		System.out.println("target:" + target.getId() + "   " + target.getToken());
		System.out.println("=================================================================");
		Assert.assertEquals("2", String.valueOf(target.getId()));
	}
}
