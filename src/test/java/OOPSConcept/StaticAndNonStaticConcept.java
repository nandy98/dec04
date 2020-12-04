package OOPSConcept;

public class StaticAndNonStaticConcept {

	
	static String name = "tom";//static variable
	int age = 22;//non static variable
	public static void main(String[] args) {
		//static method and variable calls
		
		sum();//direct calling 
		StaticAndNonStaticConcept.sum();//calling by class name
		
		System.out.println(name);
		System.out.println(StaticAndNonStaticConcept.name);
		
		//non static method and variable calls
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		 System.out.println(obj.age);
		 obj.sendMail();				 
	}
	
	public void sendMail() {// non static method
		System.out.println("send mail method");
	}
	
	public static void sum() {//static method
		System.out.println("this is sum method");
	}

}
