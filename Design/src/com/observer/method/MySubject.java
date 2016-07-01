package com.observer.method;

public class MySubject extends AbstractSubject {

	public void operation(){
		
		System.out.println("update self");
		notifyObserver();
	}
		
}
