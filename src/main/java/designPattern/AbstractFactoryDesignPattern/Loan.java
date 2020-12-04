package designPattern.AbstractFactoryDesignPattern;

public abstract class Loan {
	protected double rate;
	abstract void getInterestRate(double rate);
	public void calculateLoanPayment(double loanAmount, int years) {
		double emi;
		int n;
		n=years*12;
		rate = rate/1200;
		emi= (loanAmount/years)+(((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount);  
		System.out.println("your monthly emi is " + emi + " the loanAmount you have borrowed "+ loanAmount);
	}
}
