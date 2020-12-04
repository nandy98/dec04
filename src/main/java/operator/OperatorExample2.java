package operator;

public class OperatorExample2 {
	public static void main(String[] args) {
		int n=0;
		int k = n++ + ++n;
		System.out.println(k);// output 2
		System.out.println(n);// output 2
		System.out.println("--------");
		
		int x= 0;
		int y =x++ + x++;
		System.out.println(y);//output 1
		System.out.println(x);//output 2
		
		System.out.println("----------");
		int p =0;
		int l = p++ + ++p + ++p + p++;
		System.out.println(l);//output 8
		System.out.println(p);//output 4
	}
}
