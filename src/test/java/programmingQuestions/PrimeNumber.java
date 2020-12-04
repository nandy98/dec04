package programmingQuestions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for(int num=2;num<i;num++) {
			if(i<2) {
				System.out.println(i + " is not a prime number");
			}else if(i%num==0) {
				System.out.println(i + " is not a prime number");
				break;
			}else {
				System.out.println(i + " is a prime number");
				break;
			}
				
			}
			
		}
	}


