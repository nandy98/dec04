package designPattern.SingletonDesignPattern;

public class SingletonClassMain {

	public static void main(String[] args) {
		SingletonClass a = SingletonClass.getInstance();
		System.out.println(a.sum(10, 10));
		
		SingletonClass b = SingletonClass.getInstance();
		System.out.println(b.sum(10, 10));
		

	}

}
