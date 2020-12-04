package OOPSConcept2;

public class BMW extends Car{ //has a relation

	/*when same method is present in child and parent class with the same name and same arguments 
	is called method overriding*/
	//method overriding is also called run-time or dynamic polymorphism
	public void start() {
		System.out.println("BMW-start method");
	}
	
	public void theftSafety() {
		System.out.println("theftSafety method");
	}
}
