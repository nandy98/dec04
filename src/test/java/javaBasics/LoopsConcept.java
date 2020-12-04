package javaBasics;

public class LoopsConcept {

	public static void main (String args []) {
		
		//While loop
		
		int i=1;
		//System.out.println(++i);
		//disadvantage of while loop is that it will create infinite loop if we forget to increment/decrement
		while(i<=10) {
			System.out.println(i);
			i++;
		}		
		System.out.println("-------------");
		
		for(int j=0; j<5;j++)//initialize,condition,increment/decrement
		{
			System.out.println(i);
		}
	}
}
