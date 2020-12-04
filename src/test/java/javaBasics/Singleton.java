package javaBasics;

public class Singleton {

	//when we can create only one object of a class is class called singleton
	//make constructor as private
	//write a public static method (getInstance) that has return type of object of this singleton class
	
	private static Singleton SingletonInstance = null;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(SingletonInstance==null) {
			SingletonInstance = new Singleton();
		}
		return SingletonInstance;
	}
	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		
	}

}
