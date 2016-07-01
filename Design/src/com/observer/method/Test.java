package com.observer.method;

public class Test {

	public static void main(String[] args) {
		
		Subject sb = new MySubject();
		sb.add(new Observer1());
		sb.add(new Observer2());
		
		sb.operation();
	}
}
