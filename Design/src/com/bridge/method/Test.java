package com.bridge.method;

/**
 * 
 * @author hellocat
 *
 *�Ž�ģʽ��ͨ����bridge ��ĵ��ã�ʵ���˶Խӿ� Sourceable��ʵ���� SourceSub1 ��SourceSub2 �ĵ���
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
