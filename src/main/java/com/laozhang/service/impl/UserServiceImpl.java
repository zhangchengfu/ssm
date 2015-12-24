package com.laozhang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laozhang.dao.IUserDao;
import com.laozhang.domain.User;
import com.laozhang.service.IUserService;

@Transactional
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao dao;

	public User getUserById(int id) {
		return dao.selectByPrimaryKey(id);
	}
	
	public List<User> getAll() {
		return dao.getAll();
	}

	public void addUser(User user) {
		dao.insertSelective(user);
	}

	public void deleteUser(int id) {
		dao.deleteByPrimaryKey(id);
	}

	public void updateUser(User user) {
		dao.updateByPrimaryKeySelective(user);
	}

}
