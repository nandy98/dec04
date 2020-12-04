package OOPSConcept2;

public interface USBank {

	//only method declaration
	//no method body, only method prototype
	//variables are by default static and final in nature
	//variables value will not be changed.i.e final
	//no static method in interface
	//no main method
	//cannot create object of interface
	//interface are abstract in nature
	int min_bal =100;
	
	public void credit();	
	public void debit();//only public and abstract modifier permitted
	public void transferMoney();
	
}
