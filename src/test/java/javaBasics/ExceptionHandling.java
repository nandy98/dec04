package javaBasics;

public class ExceptionHandling {

	public static void main(String[] args) {

		//uncaught exception
		//int i = 9/0;
		//System.out.println(i);
		
		//caught exception
		//Thread.sleep(3000);
		
		// 1. try catch block 
		
		System.out.println("java");
		try{
			System.out.println("selenium");
			System.out.println("selenium");
			int i= 9/0; 
			
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	/*	System.out.println("selenium");
		System.out.println("selenium");*/
	}

}
