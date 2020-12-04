package OOPSConcept;

public class FunctionsInJava {

	//cannot create function inside a function
	//duplicate functions are not allowed 
	//non static method
	//no input, no output
	public void test(){
		System.out.println("rrr");
	}
	
	public void test(int i){
		System.out.println("rrr");
	}
	
	public void test(int i,int j){
		System.out.println("rrr");
	}
	
	//Method overloading:- when in the same class function names are same with different parameters 
	
	//no input, some output
	public int sum() {
		int i = 10;
		int j=20;
		 int sum = i+j;
		 return sum;
	}
	
	//some input, some output
	
	public int add(int a, int b) {
		int add = a+b;
		return add;
	}

	public static void main(String[] args) {
		FunctionsInJava func = new FunctionsInJava();
		System.out.println(func.sum());
		System.out.println(func.add(10, 20));
		
}
}