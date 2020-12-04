package programmingQuestions;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		//4! = 4*3*2*1
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int num=i;
		int fact=i;
		while(num>1) {
			fact = fact*(num-1);
			num=num-1;
		}		
			System.out.println("factorial is :" + fact);		
	}
}
