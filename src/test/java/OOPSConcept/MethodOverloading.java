package OOPSConcept;

public class MethodOverloading {
	
	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	}
	//main method can be overloaded
	public static void main() {
		System.out.println("overloaded main method");
	}

	//we cannot create a method inside a method
	//duplicate methods are not allowed 
	
	public void sum() {
		System.out.println("sum method with 0 parameter");
	}
	
	public void sum(int i) {
		System.out.println("sum method with 1 parameter");
	}
	
	public void sum(int i,int j) {
		System.out.println("sum method with 2 parameter");
	}
	//Method overloading:- when in a class, function names are same with different parameters and data types
}
