package javaBasics;

public class StringConcatination {

	
	public static void main(String[] args) {

		// (+) is String concatenation operator
		
		int a =100;
		int b =200;
		
		String x = "hello";
		String y = "world";
		
		double c =12.11;
		double d =13.89;
		
		System.out.println(a+b);//output: 300
		System.out.println(x+y);//output: helloworld
		System.out.println(a+b+x+y);//output: 300helloworld
		System.out.println(x+y+a+b);//output: helloworld100200
		System.out.println(x+y+(a+b));//output: helloworld300
		System.out.println(a+b+x+y+a+x+b+y);//output: 300helloworld100hello200world
		System.out.println(a+b+x+y+a+b);//output: 300helloworld100200
		System.out.println(c+d);//output: 26.00
		System.out.println(x+y+c+d); //output: hellowworld12.1113.89
		
	}	

}
