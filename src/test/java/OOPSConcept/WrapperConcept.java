package OOPSConcept;

public class WrapperConcept {

	public static void main(String args[]) {
		String x ="100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String y = "100.34";
		double d = Double.parseDouble(y);
		
		String s = "true";
		 boolean a = Boolean.parseBoolean(s);
		 
		 //from int to string
		 int k = 200;
		 String str = String.valueOf(k);
		 System.out.println(str + 200);
		
	
		 String c = "23c";
		 int h = Integer.parseInt(c);
		 //System.out.println(h+10);	 //number format exception
		
	}
}
