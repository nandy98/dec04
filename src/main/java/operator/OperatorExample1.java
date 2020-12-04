package operator;

public class OperatorExample1 {
	public static void main(String[] args) {
		//pre-increment
		int n = 0 ;
		System.out.println(++n);// output 1
		
		//pre-decrement
		int k=2;
		System.out.println(--k);// output 1
		
		//post-increment
		int j = 20;
		System.out.println(j++);// output 20
		System.out.println(j);// output 21
		
		//post-decrement
		int y=31;
		System.out.println(y--);//output 31
		System.out.println(y);//output 30
	}
}
