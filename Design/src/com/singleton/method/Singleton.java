package com.singleton.method;

public class Singleton {

	//����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull ,Ŀ����ʵ���ӳټ���
	private static Singleton instance = null;
	
	//˽�й��죬��ֹ��ʵ����
	 private Singleton(){}
	 
	 //��̬���̷����� ����ʵ��
	 public static Singleton getInstace(){
		 
		 if (instance == null) {
			 synchronized (instance) {
				 if (instance==null) {
					 instance = new Singleton();
				}
				
			}
			
		}
		 return instance;
	 }
	 
}
