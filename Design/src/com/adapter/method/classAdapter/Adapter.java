package com.adapter.method.classAdapter;


/**
 * ���������ģʽ�� ����˼�� ���� ��һ��source �࣬ӵ�и�һ����������
 * Ŀ��ӿ��� Targetable ͨ�� Adapter �࣬��source �Ĺ�����չ��Targetable ��
 * @author hellocat
 * �Լ����⣺
 * ���������ģʽ��3����
 * 1��ԭ��source��ӵ��һ��������ķ����� �ñ���һ�������ϵ����ײ��
 * 2�� Ŀ��ӿڣ� Ҫӵ��ԭ��ͬ���ķ����� ��Ҫ���Լ��ķ�����  Ŀ��ӿڷ����� ��Ҫ���ֻ����
 * 
 * 3��������� adapter Ҫ�̳�ԭ�࣬ͬʱ��Ҫʵ��Ŀ��ӿ�     ��ʱ���Ҫʹ��һ�����ţ��������ײ�ڣ�ͬʱ�ṩ2�ײ��
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println(" this is the targetable method!");
	}
}
