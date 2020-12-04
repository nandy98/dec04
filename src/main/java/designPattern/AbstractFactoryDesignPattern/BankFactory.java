package designPattern.AbstractFactoryDesignPattern;

public class BankFactory extends AbstractFactory{

	public Bank getBankName(String bName) {
		if(bName.equalsIgnoreCase("ICICI")) 
		return new ICICI();
		
		else if (bName.equalsIgnoreCase("HDFC"))
		return new HDFC();
		
		else  
		return new SBI();
		}

	public Loan getLoanType(String loanType) {
		return null;
		
	}
	
}
