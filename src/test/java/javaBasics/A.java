package javaBasics;

public class A {
	
	public A() {
		System.out.println("parent class constructor");
	}

	public A(int i) {
		System.out.println("parent class constructor with 1 param : " + i);
	}
	
	public A(int i, int j) {
		System.out.println("parent class constructor with 1st param : " + i + "and 2nd param :" + j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
