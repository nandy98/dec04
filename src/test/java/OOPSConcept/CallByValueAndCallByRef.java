package OOPSConcept;

public class CallByValueAndCallByRef {

	int p;
	int r ;
	public static void main(String[] args) {
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x =10;
		int y=20;
		int a = obj.sum(x, y);// call by value 
		System.out.println(a);
		obj.p=23;
		obj.r=27;
		obj.swap(obj);
		obj.add();
	}

	public static void add() {
	}
	public int sum(int a,int b) {
		a = 40;
		b = 50;
		int sum = a+b;
		return sum;
	}
	
	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp = t.p;
		t.p= t.r;
		t.r=temp;
	}
}
