package hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String s1 = obj.nextLine();
		String s2 = obj.nextLine();
		boolean status = true;
		if(s1.length()!=s2.length()){
			status = false;
			System.out.println("--------");
			System.out.println("not a anagram");
		}else {
			char[] str1 = s1.toLowerCase().toCharArray();
			char[] str2 = s2.toLowerCase().toCharArray();
			//Arrays.sort(str1);
			//Arrays.sort(str2);
			status=Arrays.equals(str1, str2);			
		}
			if(status==true) {
				System.out.println("anagram");
			}else {
				System.out.println("not a anagram");
			}
		}
		}
