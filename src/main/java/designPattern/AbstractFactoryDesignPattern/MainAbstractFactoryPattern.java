package designPattern.AbstractFactoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAbstractFactoryPattern {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name of the bank from where you will take loan");
		String bank = br.readLine();
		
		System.out.println("enter the type of loan you want");
		String l = br.readLine();
		
		AbstractFactory bankFactory = FactoryCreator.getFactory("bank");
		Bank bankName = bankFactory.getBankName(bank);
		
		System.out.println("Enter the interest rate for" + bankName.getBankName()+" :");
		double rate = Double.parseDouble(br.readLine());
		
		System.out.println("Enter the loan amount you want to take :");
		double loanAmount = Double.parseDouble(br.readLine());
		
		System.out.println("Enter number of years to pay the loan amount ");
		int years = br.read();
		
		System.out.println("you are getting the loan from :" + bankName.getBankName());
		
		AbstractFactory loan = FactoryCreator.getFactory("loan");
		Loan loanType = loan.getLoanType(l);
		loanType.getInterestRate(rate);
		loanType.calculateLoanPayment(loanAmount, years);
	}

}
