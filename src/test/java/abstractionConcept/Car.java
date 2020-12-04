package abstractionConcept;

public interface Car {

	//always define only abstract method.i.e only method declaration without body
	//100% abstraction
	//Cannot create object of interface
	//only public, final and static variable we can define
	
	 int a =10;
	
	public void start();
	public void stop();
	public void refuel();
}
