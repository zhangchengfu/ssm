package com.laozhang.dao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

public abstract class RedisDao<K extends Serializable, V extends Serializable> {
	
	@Autowired
	private RedisTemplate<K, V> redisTemplate;
	
	protected RedisSerializer<String> getRedisSerializer() {
		return redisTemplate.getStringSerializer();
	}
	
	public void insert(K tableKey, String dataKey, V v) {
		redisTemplate.opsForHash().put(tableKey, dataKey, v);
	}
	
	public void update(K tableKey, String dataKey, V v) {
		redisTemplate.opsForHash().put(tableKey, dataKey, v);
	}
	
	public void delete(K tableKey, String dataKey) {
		redisTemplate.opsForHash().delete(tableKey, dataKey);
	}
	
	@SuppressWarnings("unchecked")
	public V selectOne(K tableKey, String dataKey) {
		return (V) redisTemplate.opsForHash().get(tableKey, dataKey);
	}
}
