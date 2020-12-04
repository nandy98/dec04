package designPattern.AbstractFactoryDesignPattern;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBankName(String bName) {
		return null;
	}

	@Override
	public Loan getLoanType(String loanType) {
		if(loanType==null)
			return null;
		else if (loanType.equalsIgnoreCase("HomeLoan"))
			return new HomeLoan();
		else if(loanType.equalsIgnoreCase("educationLoan"))
			return new EducationLoan();
		else if (loanType.equalsIgnoreCase("BuisenessLoan"))
			return new BuisenessLoan();
		return null;
	}

}
