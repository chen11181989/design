package com.adapter.method.classAdapter;


/**
 * 类的适配器模式， 核心思想 就是 有一个source 类，拥有个一方法待适配
 * 目标接口是 Targetable 通过 Adapter 类，将source 的功能扩展到Targetable 里
 * @author hellocat
 * 自己见解：
 * 类的适配器模式分3步：
 * 1：原类source，拥有一个待适配的方法， 好比是一个插座上的三孔插口
 * 2： 目标接口， 要拥有原类同样的方法， 还要有自己的方法。  目标接口方法， 是要给手机充电
 * 
 * 3类的适配器 adapter 要继承原类，同时还要实现目标接口     这时候就要使用一个插排，连接三孔插口，同时提供2孔插口
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println(" this is the targetable method!");
	}
}
