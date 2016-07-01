package com.facade.method;

/**
 * ���ģʽ��Ϊ�˽��������ֱ�ӵ�������ϵ
 * ��springһ�������Խ������֮��Ĺ�ϵ���õ������ļ��У������ģʽ���ǽ����ǵĹ�ϵ����һ��Facade���У�����������֮�����϶ȣ�
 * @author hellocat
 *
 *�������û��Computer�࣬��ô��CPU��Memory��Disk����֮�佫���໥����ʵ����
 *������ϵ��������������ص��������޸�һ���࣬���ܻ������������޸ģ��ⲻ��������Ҫ�����ģ�
 *����Computer�࣬����֮��Ĺ�ϵ��������Computer������������˽�������ã��⣬�������ģʽ��
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
