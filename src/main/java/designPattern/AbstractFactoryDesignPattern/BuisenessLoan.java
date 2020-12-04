package designPattern.AbstractFactoryDesignPattern;

public class BuisenessLoan extends Loan{

	@Override
	void getInterestRate(double r) {
		rate = r;
	}

}
