package javaBasic;

public class MissingNumInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,6};
		int sum1 = 0,sum2 = 0;
		for(int i=0;i<a.length;i++){
			sum1 = sum1 + a[i];
		}
		
		for(int i=1;i<=6;i++) {
			sum2= sum2+i;
		}

		System.out.println("the missing num is" + (sum2-sum1));
	}

}
