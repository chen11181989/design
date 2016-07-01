package com.abs.factory.method;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is a sms");
	}

}
