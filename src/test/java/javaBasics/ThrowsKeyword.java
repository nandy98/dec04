package javaBasics;

public class ThrowsKeyword {

	//jvm is catching exception internally in throws 
	
	public static void main(String[] args) {
		sum();

	}

	public static void sum() {
		div();
	}
	public static void div() throws ArithmeticException {
		int i=9/0;
	}
}
