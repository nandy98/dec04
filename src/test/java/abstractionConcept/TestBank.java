package abstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.mutualFund();
		System.out.println("-------- ");
		Bank b = new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
		
		
	}

}
