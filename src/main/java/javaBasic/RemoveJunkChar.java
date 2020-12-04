package javaBasic;

public class RemoveJunkChar {

	public static void main(String[] args) {
		String str = "sfhsjf232327>/<1!@@!!%^";
		str =str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
