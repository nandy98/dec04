package javaBasics;

public class ConstructorWithThisKeyword {

	// this keyword is used to initialize the class variable in the constructor
	String name ;
	int age; 
	public ConstructorWithThisKeyword(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("hari", 10); 
	}

}
