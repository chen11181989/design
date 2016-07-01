package com.decorator.method;

/**
 * 装饰类，
 * @author hellocat
 * 跟被装饰类实现同一个接口 , 装饰对象持有被装饰对象的实例
 */
public class Decorator implements Sourceable {

	private Source source;
	public Decorator(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before decorator");
		
		source.method();
		System.out.println("after decorator");
	}

}
