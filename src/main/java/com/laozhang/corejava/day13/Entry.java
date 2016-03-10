package com.laozhang.corejava.day13;

/**
 * @描述 本类用来演示自定义泛型类
 * @日期 May 14, 2013 11:00:56 AM
 * @作者 JSD1304
 */
public class Entry<K,V> {
	//属性
	private K key;
	private V value;
	
	//构造方法
	public Entry(K key,V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey(){
		return this.key;
	}
	
	public void setKey(K key){
		this.key = key;
	}
	
	public V getValue(){
		return this.value;
	}
	
	public void setValue(V value){
		this.value = value;
	}
}
