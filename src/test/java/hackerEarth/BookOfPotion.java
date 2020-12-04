package hackerEarth;

import java.util.Scanner;

public class BookOfPotion {

	public static void main(String[] args) {
		int i = 10;
		int sum = 0;
		System.out.println("Enter number");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		while(num!=0) {
			sum = sum + ((num%10)*i--);
			num=num/10;
		}
		if(sum%11==0) {
			System.out.println("legal ISBN");
		}else {
			System.out.println("Illegal ISBN");
		}
		
}
}