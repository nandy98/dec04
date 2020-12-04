package abstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		System.out.println("----");
		Car c = new BMW();
		c.start();
		c.refuel();
		c.start();
	}

}
