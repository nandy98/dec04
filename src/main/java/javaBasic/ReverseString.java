package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) throws IOException {
		/*Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str = br.readLine();
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev =rev+str.charAt(i);		
		}
		System.out.println(str.length());
		System.out.println(rev);*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		StringBuffer sb = new StringBuffer(st);
		System.out.println(sb.reverse());
		
	}

}
