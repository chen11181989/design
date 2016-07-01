package com.abs.factory.method;

/**
 * π§≥ß¿‡
 * @author hellocat
 *
 */
public class SmsSenderFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
