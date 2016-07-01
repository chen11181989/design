package com.decorator.method;

/**
 * װ���࣬
 * @author hellocat
 * ����װ����ʵ��ͬһ���ӿ� , װ�ζ�����б�װ�ζ����ʵ��
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
