package designPattern.AbstractFactoryDesignPattern;

public class SBI implements Bank{
	
	private final String bankName;

	public SBI(){
		bankName = "SBI";
	}	
	
	public String getBankName() {
		return bankName;
	}

	
}
