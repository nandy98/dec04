package designPattern.SingletonDesignPattern;

public class SingletonClass {
	//Early Initialization

	private static SingletonClass obj = new SingletonClass();
	
	private SingletonClass() {
		
	}
	
	static SingletonClass getInstance(){
		return obj;
	}
	
	public int sum(int a, int b) {
		a=a+b;
		return a;
	}
}
