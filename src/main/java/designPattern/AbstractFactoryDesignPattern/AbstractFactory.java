package designPattern.AbstractFactoryDesignPattern;

public abstract class AbstractFactory {
	public abstract Bank getBankName(String bName);
	public abstract Loan getLoanType(String loanType);

}
