package com.factory.method;

/**
 * �������ģʽ �ṩ��������������ֱ𴴽����� �� ��������ϼ��� static ���Ϊ��̬����ģʽ
 * һ��ʹ�þ�̬����ģʽ
 * @author hellocat
 *
 */
public class FactoryMore {

	public Sender produceMail(){
		
		return new MailSender();
	}
	
	public Sender produceSms(){
		
		return new SmsSender();
	}
}
