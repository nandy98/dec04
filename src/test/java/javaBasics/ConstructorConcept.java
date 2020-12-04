package javaBasics;

public class ConstructorConcept {

	// while creating object if we want to define some class feature as global variable(object) then we are using constructor
	// constructor does not return any value
	// constructor name must be same as class name
	
	 public ConstructorConcept() {
		 System.out.println("default Constructor");
	 }
	
	 public ConstructorConcept(int i) {
		 System.out.println("one parameter Constructor");
	 }
	 
	 public ConstructorConcept(int i, int j) {
		 System.out.println("two parameter Constructor");
	 } 
	 
	 
public static void main(String args[]) {
	
	ConstructorConcept obj = new ConstructorConcept();
	ConstructorConcept obj1 = new ConstructorConcept(10);
	ConstructorConcept obj2 = new ConstructorConcept(10,20);
		
}
}

