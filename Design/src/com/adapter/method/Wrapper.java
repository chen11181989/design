package com.adapter.method;

import com.adapter.method.classAdapter.Source;
import com.adapter.method.classAdapter.Targetable;

/**
 * 
 * @author hellocat
 * �����������ģʽ
 * �����������ģʽ���� ��ֻ�ǽ�adapter �����޸ģ� ���ü̳�source �� �����ǳ���source �����
 *  
 *
 */
public class Wrapper implements Targetable {
	
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		 System.out.println("this is the targetable method!");
	}

}
