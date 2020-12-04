package programmingQuestions;

import java.util.Scanner;

public class ArmstrongNumber {

	//407=4*4*4+0+7*7*7=407
	//153=1*1*1+5*5*5+3*3*3
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = sc.nextInt();
		int num=i;
		int mod;
		while(num!=0) {
			mod = num%10;
			sum = sum + mod*mod*mod;
			num=num/10;
		}
		if(i==sum) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not an armstrong number");
		}
	}

}
