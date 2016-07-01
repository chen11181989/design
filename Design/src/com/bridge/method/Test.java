package com.bridge.method;

/**
 * 
 * @author hellocat
 *
 *桥接模式：通过对bridge 类的调用，实现了对接口 Sourceable的实现类 SourceSub1 和SourceSub2 的调用
 *
 *
 */
public class Test {
 public static void main(String[] args) {
	
	 Bridge b = new MyBridge();
	 Sourceable s1 = new SourceSub1();
	 b.setSourceable(s1);
	 b.method();
	 
	 
	 Sourceable s2 = new SourceSub2();
	 b.setSourceable(s2);
	 b.method();
	 
}
}
