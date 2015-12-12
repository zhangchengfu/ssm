package com.laozhang.dao.impl;

import org.springframework.stereotype.Repository;

import com.laozhang.dao.IUserDtoDao;
import com.laozhang.dao.RedisDao;
import com.laozhang.dto.UserDto;

@Repository
public class UserDtoDaoImpl extends RedisDao<String, UserDto> implements IUserDtoDao {
	
	private String tableKey = "user";

	public UserDto selectUserDto(String key) {
		return selectOne(tableKey, key);
	}

	public void updateUserDto(String key, UserDto value) {
		update(tableKey, key, value);
	}

	public void insertUserDto(String key, UserDto value) {
		insert(tableKey, key, value);
	}

	public void deleteUserDto(String key) {
		delete(tableKey, key);
	}

}
