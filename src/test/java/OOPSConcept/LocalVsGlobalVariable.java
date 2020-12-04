package OOPSConcept;

public class LocalVsGlobalVariable {

	String name = "tom";//global variable
	int age =25;//global variable
	
	public static void main(String[] args) {
	
		int i =10;//local variable
		System.out.println(i);
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}
	
	public int sum() {
		int i=30;//local variable
		int j=20;//local variable
		int sum = i+j;//local variable
		
		return sum;
	}

}
