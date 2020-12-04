package OOPSConcept2;

public class HSBCBank implements USBank, BrazilBank{

	public void credit() {
		System.out.println("hsbc---credit method");
		
	}

	public void debit() {
		System.out.println("hsbc---debit method");
		
	}

	public void transferMoney() {
		System.out.println("hsbc---transferMoney method");
		
	}

	public void educationLoan() {
		System.out.println("hsbc---educationLoan method");
	}
	
	public void carLoan() {
		System.out.println("hsbc---carLoan method");
	}

	public void mutualfund() {
		System.out.println("hsbc---mutualfund method");
		
	}
}
