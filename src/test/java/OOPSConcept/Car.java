package OOPSConcept;

public class Car {

	//class variqable
	int mod;
	int wheel;
	
	public static void main(String args[]) {
	
		//new Car() is object of Car class and a,b,c are object reference variable
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod =2010;
		a.wheel= 4;
		
		b.mod =2020;
		b.wheel= 3;
		
		c.mod =2011;
		c.wheel= 5;
		
		System.out.println("before assigning the reference");
		
		System.out.println(a.mod);//output: 2010
		System.out.println(b.wheel);//output: 3
		
		System.out.println("after assigning the reference");
		//shifting of reference variable from one to other object
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.mod);//output: 2020
		System.out.println(a.wheel);//output: 3
	
		System.out.println(b.mod);//output: 2011
		System.out.println(b.wheel);//output: 5
		
		//the value will come from b bcz a is already left th
		System.out.println(c.mod);//output: 2020
		System.out.println(c.wheel);//output: 3
	}
}
