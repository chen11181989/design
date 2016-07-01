package com.adapter.method.interfaceAdapter;

/**
 * 接口适配器模式：
 * 
 * @author hellocat
 * 有时我们写的一个接口中有多个抽象方法，当我们实现接口时必须实现这些方法，显然是比较浪费的
 * 因为有些方法可能并不需要去实现，所以引用了接口的适配器模式
 * 借助一个抽象类，该抽象类实现接口，及所有方法
 * 而我们不和原始接口打交道，只和该抽象类取得联系，所以我们写一个类，继承该抽象类，重写我们需要的方法就行
 *
 *
 */
public interface Sourceable {

	public void methode1();
	public void	methode2();
		
}
