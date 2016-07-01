package com.proxy.method;

public class Proxy implements Sourceable {

	private Source source;
	public Proxy(Source source) {
		super();
		this.source = source;
	}


	@Override
	public void method() {
		// TODO Auto-generated method stub
		//=============
		 source.method();
	}

}
