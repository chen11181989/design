package com.builder.method;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式  : 工厂模式提供创建单个类的模式， 建造者模式则是将各种产品集中起来进行管理，用来
 * 创建复合对象
 * 所谓复合对象就是指某个类具有不同的属性
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
