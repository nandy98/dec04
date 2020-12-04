package designPattern.AbstractFactoryDesignPattern;

public class FactoryCreator {
	
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("bank"))
			return new BankFactory();
		else 
			return new LoanFactory();
		
	}

}
