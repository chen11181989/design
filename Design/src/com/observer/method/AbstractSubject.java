package com.observer.method;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	//存放的是需要监控对象的所有列表
	private Vector<Observer> vector = new Vector<Observer>();
	
	//可以对列表进行修改：增加，或者删除被监控对象
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		 vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		// TODO Auto-generated method stub
		vector.remove(observer);
	}

	@Override
	public void notifyObserver() {
		Enumeration<Observer> enumo=  vector.elements();
		while (enumo.hasMoreElements()) {
		enumo.nextElement().update();			
		}
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub

	}

}
