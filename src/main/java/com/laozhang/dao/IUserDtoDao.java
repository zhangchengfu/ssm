package com.laozhang.dao;

import com.laozhang.dto.UserDto;

public interface IUserDtoDao {
	UserDto selectUserDto(String key);
	void updateUserDto(String key, UserDto value);
	void insertUserDto(String key, UserDto value);
	void deleteUserDto(String key);
}
