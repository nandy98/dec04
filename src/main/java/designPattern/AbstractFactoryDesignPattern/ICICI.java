package designPattern.AbstractFactoryDesignPattern;

public class ICICI implements Bank{
	
	private final String bankName;
	
	public ICICI(){
		bankName = "ICICI";
	}

	public String getBankName() {
	return bankName;
	}

}
