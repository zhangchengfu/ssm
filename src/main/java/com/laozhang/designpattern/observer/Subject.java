package com.laozhang.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	//用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();
	
	//注册观察者对象
	public void attach(Observer observer) {
		observers.add(observer);
		System.out.println("Attach an observer");
	}
	
	//删除观察者对象
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	//通知所有注册的观察者对象
	public void notifyObserver(String newState) {
		for (Observer observer : observers) {
			observer.update(newState);
		}
	}
}
