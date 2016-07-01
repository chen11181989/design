package com.adapter.method;

import com.adapter.method.classAdapter.Source;
import com.adapter.method.classAdapter.Targetable;

/**
 * 
 * @author hellocat
 * 对象的适配器模式
 * 和类的适配器模式相似 ，只是将adapter 类做修改， 不用继承source 类 ，而是持有source 类对象
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
