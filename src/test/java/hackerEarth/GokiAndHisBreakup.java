package hackerEarth;

import java.util.Scanner;

public class GokiAndHisBreakup {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number");
		int n = obj.nextInt();
		int x = obj.nextInt();
		while(n--!=0) {
			System.out.println("enter number");
			int y = obj.nextInt();
			if(x<=y) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
