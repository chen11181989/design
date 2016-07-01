package com.factory.method;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("这是邮件发送");

	}

}
