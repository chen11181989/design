package com.facade.method;

/**
 * 外观模式是为了解决类与类直接的依赖关系
 * 像spring一样，可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度，
 * @author hellocat
 *
 *如果我们没有Computer类，那么，CPU、Memory、Disk他们之间将会相互持有实例，
 *产生关系，这样会造成严重的依赖，修改一个类，可能会带来其他类的修改，这不是我们想要看到的，
 *有了Computer类，他们之间的关系被放在了Computer类里，这样就起到了解耦的作用，这，就是外观模式！
 */
public class Computer {

	private CPU cpu;
	private Memory memory;
	private Disk disk;
	public Computer(CPU cpu, Memory memory, Disk disk) {
		super();
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
	}
	
	public void startUp(){
		System.out.println("computer start");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("start finished");
	}
}
