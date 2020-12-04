package testPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestNumber{

public static void main(String args[]) throws NumberFormatException, IOException{

int a,b,c;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter 1st number" + "\n");

a= Integer.parseInt(br.readLine());

System.out.println("Enter 2nd number");

b= Integer.parseInt(br.readLine());

System.out.print("Enter 3rd number");

c= Integer.parseInt(br.readLine());

if(a>b && a<c){	
System.out.println("a is second largest number");

} else if ((a<b && a<c)&&b<c){
 	System.out.println("b is second largest number");
}
else{
System.out.println("c is 2nd largest number");

}
}

}

