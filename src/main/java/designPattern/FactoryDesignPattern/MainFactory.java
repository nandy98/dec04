package designPattern.FactoryDesignPattern;

public class MainFactory {

	public static void main(String[] args) {
		// in the below approach, we are exposing the concrete class directly to the client .i.e main method
		OS os1 = new Android();
		os1.spec();
		
		OS os2 = new Window();
		os2.spec();
		
		OS os3 = new Window();
		os3.spec();
		
		System.out.println("--------");
		/*if we don't expose the concrete class to the client then we need to create a factory class and then call 
		factory class*/
		
		OSFactory osf = new OSFactory();
		OS of1 = osf.getOS("open");
		of1.spec();
		
		OS of2 = osf.getOS("close");
		of2.spec();
		
		OS of3 = osf.getOS("hjhjh");
		of3.spec();

	}

}
