package abstractionConcept;

public abstract class Bank {

	//partial abstraction
	// hiding the implementation logic is called abstraction
	//cannot create object of abstract class
	 
	public abstract void loan();//abstract method -- no method body
	
	public void credit() {
		System.out.println("Bank-- credit method");
	}
	
	public void debit() {
		System.out.println("Bank-- debit method");
	}
}
