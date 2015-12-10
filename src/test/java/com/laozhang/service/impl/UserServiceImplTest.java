package com.laozhang.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.laozhang.domain.User;
import com.laozhang.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml", "classpath:spring-mybatis.xml"})
@Transactional
public class UserServiceImplTest {
	
	@Autowired
	private IUserService service;

	@Rollback(value = false)
	@Test
	public void testGetUserById() {
		User user = service.getUserById(2);
		assertEquals(Integer.valueOf(2), user.getId());
	}

}
