package com.laozhang.service;

import java.util.List;

import com.laozhang.domain.User;

public interface IUserService {
	/**
	 * 根据id查询User
	 * @param id
	 * @return
	 */
	User getUserById(int id);
	
	/**
	 * 查询所有User
	 * @return
	 */
	List<User> getAll();
}
