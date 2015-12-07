package com.laozhang.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.laozhang.dao.IUserDao;
import com.laozhang.domain.User;
@Repository
public class UserDaoImpl implements IUserDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public int deleteByPrimaryKey(Integer id) {
		int count = sqlSession.delete("userMapper.deleteByPrimaryKey", id);
		return count;
	}

	public int insert(User record) {
		int count = sqlSession.insert("userMapper.insert", record);
		return count;
	}

	public int insertSelective(User record) {
		int count = sqlSession.insert("userMapper.insertSelective", record);
		return count;
	}

	public User selectByPrimaryKey(Integer id) {
		return sqlSession.selectOne("userMapper.selectByPrimaryKey", id);
	}

	public int updateByPrimaryKeySelective(User record) {
		int count = sqlSession.update("userMapper.updateByPrimaryKeySelective", record);
		return count;
	}

	public int updateByPrimaryKey(User record) {
		int count = sqlSession.update("userMapper.updateByPrimaryKey", record);
		return count;
	}

}
