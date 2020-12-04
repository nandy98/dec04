package programmingQuestions;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int rev = 0;
		int num = i;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(i==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a pallindrome");
		}
	}

}
