package javaBasics;

public class TwoDimensionArray {

	public static void main(String[] args) {
		String s[][]= new String[2][4];
		System.out.println(s.length);//output:2
		System.out.println(s[0].length);//output:4
		s[0][0]="a"; 
		s[0][1]="b";
		s[0][2]="c";
		s[0][3]="d";
		
		s[1][0]="e";
		s[1][1]="f";
		s[1][2]="g";
		s[1][3]="h";
		
		System.out.println(s[1][3]);//output: h
		
		System.out.println("---------------");
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[0].length;j++) {
				System.out.println(s[i][j]);
			}
		}
		
	}

}
