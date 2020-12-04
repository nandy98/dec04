package OOPSConcept2;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		//when a method is common in child and parent class then child class method will be called 
		b.start();//BMW-start method
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//c.threadSafety(); cannot access the child class method
		
		//top casting, up casting 
		Car c1 = new BMW();//dymanic polymorphism--run time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		//c1.threadSafety(); cannot access the child class method

		//Down Casting
		
		BMW b1 = (BMW)new Car();//ClassCastException we will get
	}

}
