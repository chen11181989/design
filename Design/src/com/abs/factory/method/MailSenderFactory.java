package com.abs.factory.method;

/**
 * ������
 * @author hellocat
 *
 */
public class MailSenderFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
