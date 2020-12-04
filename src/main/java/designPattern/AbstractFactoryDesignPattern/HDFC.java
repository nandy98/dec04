package designPattern.AbstractFactoryDesignPattern;

public class HDFC implements Bank{

	private final String bankName;
	
	public HDFC() {
		bankName = "HDFC";
	}
	public String getBankName(){
		return bankName;
	}
}
