package javaBasics;

public class B extends A{
	
	//super keyword is used to call the constructor from the parent class and must be first statement
	public B() {
		super(10,20);
		System.out.println("child class constructor");
	}
	
	public static void main(String[] args) {
	
		B b = new B(); // parent class constructor will be called first and then the child class constructor

	}

}
