package com.factory.method;

/**
 * ��ͨ����ģʽ �����ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
 * @author hellocat
 *
 */
public class Factory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {

			return new SmsSender();
		} else {
			System.out.println("��������ȷ������");

		}
		return null;
	}

	public static void main(String[] args) {
		 Factory f= new Factory();
		Sender s =  f.produce("sms");
		s.send();
	}
}
