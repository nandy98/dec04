package designPattern.BuilderPattern;

public class Phone {
	
	private int ram;
	private int screenSize;
	private int battery;
	private String processor;
	private String os;
	public Phone(int ram, int screenSize, int battery, String processor, String os) {
		super();
		this.ram = ram;
		this.screenSize = screenSize;
		this.battery = battery;
		this.processor = processor;
		this.os = os;
	}
	@Override
	public String toString() {
		return "Phone [ram=" + ram + ", screenSize=" + screenSize + ", battery=" + battery + ", Processor=" + processor
				+ ", OS=" + os + "]";
	}
	
}
