package com.prototype.method;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式 :  一个原型类，只需要实现Cloneable 接口， 覆写Clone 方法， 方法名称可以改成任意名称
 * @author hellocat
 * 深浅复制概念：
 * 浅复制：将以个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的
 * 深复制：将以个对象复制后，不论基本数据类型还是引用数据类型，都是重新创建的，简单来说，深复制进行了完全彻底的复制
 * 而浅复制不彻底
 *
 */
public class Prototype implements Cloneable ,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String string;
	

	/**
	 * 浅复制
	 */
	public Object clone() throws CloneNotSupportedException{
		
		Prototype proto = (Prototype) super.clone();
		
		 return proto;
	}
	
	/**
	 * 深复制 ：实现深复制，需要采用流的形式，读入当前的二进制输入，在写出二进制数据对应的对象
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException{
		
		// 写入当前对象的二进制流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		 ObjectOutputStream oos = new ObjectOutputStream(bos);
		 oos.writeObject(this);
		
		 //读出二进制流产生的新对象
		  ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		  ObjectInputStream ois = new ObjectInputStream(bis);
		  return ois.readObject();
		
	}
	
	
}
