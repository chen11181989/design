package com.prototype.method;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ԭ��ģʽ :  һ��ԭ���ֻ࣬��Ҫʵ��Cloneable �ӿڣ� ��дClone ������ �������ƿ��Ըĳ���������
 * @author hellocat
 * ��ǳ���Ƹ��
 * ǳ���ƣ����Ը������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ���
 * ��ƣ����Ը������ƺ󣬲��ۻ����������ͻ��������������ͣ��������´����ģ�����˵����ƽ�������ȫ���׵ĸ���
 * ��ǳ���Ʋ�����
 *
 */
public class Prototype implements Cloneable ,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String string;
	

	/**
	 * ǳ����
	 */
	public Object clone() throws CloneNotSupportedException{
		
		Prototype proto = (Prototype) super.clone();
		
		 return proto;
	}
	
	/**
	 * ��� ��ʵ����ƣ���Ҫ����������ʽ�����뵱ǰ�Ķ��������룬��д�����������ݶ�Ӧ�Ķ���
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException{
		
		// д�뵱ǰ����Ķ�������
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		 ObjectOutputStream oos = new ObjectOutputStream(bos);
		 oos.writeObject(this);
		
		 //�������������������¶���
		  ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		  ObjectInputStream ois = new ObjectInputStream(bis);
		  return ois.readObject();
		
	}
	
	
}
