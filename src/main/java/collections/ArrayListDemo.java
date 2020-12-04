package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		//String path = getClass().getClassLoader().getResource("jsons/" + fileName).getFile();
		/*  1. ArrayList implements list interface
		 	2. ArrayList is dynamic array that can have data duplicate data with different data types
		 	3. ArrayList is non-synchronized
		 	4. ArrayList maintains insertion order
		 	5. Data stores in ArrayList can be randomly access due to index mechanism  
		 */
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(4);
		ar.add(1, 2);
		ar.add(5);
		ar.add(10);
		
		/*Collections.sort(ar);
		for(int i: ar) {
			System.out.println(i);
		}
		*/
		Collections.sort(ar,Collections.reverseOrder());
		
		for(int i: ar) {
			System.out.println(i);
		}
/*		System.out.println(ar + "\n----");
		ArrayList ar1 = new ArrayList();
		ar1.addAll(ar);
		System.out.println(ar1+"\n---");
		ar1.addAll(0, ar);
		System.out.println(ar1+"\n-----");
		ar1.clear();
		System.out.println(ar1+"\n-----");
		System.out.println(ar.contains("ment")+"\n---");
		ar.removeIf(n ->(n/3==0));
		System.out.println(ar+"\n--");
		ar.forEach(n ->
		System.out.println(ar+ "\n"));	
		System.out.println("\n---");
		Collections.sort(ar);
		for(int i :ar) {
			System.out.println(i);*/
		}
		
	}


