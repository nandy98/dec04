package javaBasics;

public class ThrowKeyword {

	public static void main(String[] args) {
	
		System.out.println("ABC");
		try {
			throw new Exception("my exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("apppa");
	}

}
