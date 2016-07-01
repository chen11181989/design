package com.observer.method;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	//��ŵ�����Ҫ��ض���������б�
	private Vector<Observer> vector = new Vector<Observer>();
	
	//���Զ��б�����޸ģ����ӣ�����ɾ������ض���
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
