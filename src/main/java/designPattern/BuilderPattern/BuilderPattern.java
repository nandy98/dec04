package designPattern.BuilderPattern;

public class BuilderPattern {
	
	private int ram;
	private int screenSize;
	private int battery;
	private String processor;
	private String os;
	public BuilderPattern setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public BuilderPattern setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public BuilderPattern setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public BuilderPattern setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public BuilderPattern setOS(String os) {
		this.os = os;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(ram,screenSize , battery, processor, os);
	}
	
}
