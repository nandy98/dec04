package OOPSConcept2;

public class TestBank {

	public static void main(String[] args) {
		 
		//USBank b = new USBank(); // cannot create object of interface
		// if a class is implementing an interface then it is mandatory implement all methods of interface
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.carLoan();
		hs.educationLoan();
		hs.transferMoney();
		
		System.out.println("---------------");
		
		USBank us = new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
		System.out.println(us.min_bal);
	}

}
