package designPattern.SingletonDesignPattern;

public class Singleton {
	//Lazy Initialization

	private static Singleton obj;
	
	private Singleton() {
		
	}
	
	static Singleton getInstance(){
		if(obj==null)
			return obj;
		return obj;
	}
	
	public int sum(int a, int b) {
		a=a+b;
		return a;
	}
}
