package com.factory.method;

/**
 * 多个工厂模式 提供多个工厂方法，分别创建对象 ， 如果方法上加入 static 则称为静态工厂模式
 * 一般使用静态工厂模式
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
