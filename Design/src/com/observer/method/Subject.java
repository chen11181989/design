package com.observer.method;

public interface Subject {

	//���ӹ۲���
	public void add (Observer observer);
	//ɾ���۲���
	public void del(Observer observer);
	//֪ͨ���еĹ۲���
	public void notifyObserver();
	//����Ĳ���
	public void operation();
}
