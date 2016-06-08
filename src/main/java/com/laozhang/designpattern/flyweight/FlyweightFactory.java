package com.laozhang.designpattern.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {
	private Hashtable flyweights = new Hashtable();
	public Flyweight getFlyweight(Object obj) {
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		if (flyweight == null) {
			//产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight((String)obj);
			flyweights.put(obj, flyweight);
		}
		return flyweight;
	}
	
	public int getFlyweightSize() {
		return flyweights.size();
	}
}
