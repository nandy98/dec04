package javaBasics;

public class ArrayConcept {

public static void main(String args[]) {	
	//array: to store similar data type values in it
	//1. int array
	//lowest bound/index is 0
	//highest bound/index is size-1
	
	//disadvantage of array
	//1. it is fixed---- static array--> use collection(arrrayList,linkedList,...) to overcome 
	//2. store similar data types only--> use Object array to overcome
	
	int i[] = new int[4];
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
	
	int []k = new int[4];
	System.out.println(i[3]);//output:30
	System.out.println(i.length);//output:4
	//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
	System.out.println("--------------------------");
	for(int j=0;j<4;j++) {
		System.out.println(i[j]);		
	}
	
	//2. double array
			//3. char array
			//4. boolean array
			//5. String array
			System.out.println("---------------------------");
	
			String s[] = new String[2];
			s[0]="hello";
			s[1]="dev";
			System.out.println(s[1]);
			
			System.out.println("---------------------------");	
			//6. Object Array
			Object obj[]= new Object[5];
			obj[0]="hari";
			obj[1]='N';
			obj[2]="true";
			obj[3]=90800;
			obj[4]=908;
			System.out.println(obj[1]);//output: N
}
}