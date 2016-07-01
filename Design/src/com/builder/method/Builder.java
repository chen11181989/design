package com.builder.method;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ģʽ  : ����ģʽ�ṩ�����������ģʽ�� ������ģʽ���ǽ����ֲ�Ʒ�����������й�������
 * �������϶���
 * ��ν���϶������ָĳ������в�ͬ������
 * @author hellocat
 *
 */
public class Builder {

	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		
		 for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
		
	}
	
}
