package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		// arrayList -dynamic array
		//can contain duplicate value
		//maintain insertion order
		//not Synchronized
		//allow random access because it store values on the basis of indexes
		
		ArrayList ar = new ArrayList(); //non generic -> no dataType restriction 
		ar.add("20");
		ar.add(10);
		ar.add('c');
		ar.add("selenium");
		System.out.println(ar.size());
		
		ar.add("20");
		ar.add(10);
		ar.add('c');
		ar.add("selenium");
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		//System.out.println(ar.get(9));//indexOutOfBoundException
		
		ar.remove(3);
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i)); 
			
		}
		
		System.out.println("------------------");
		Iterator itr = ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); // generic -> having data type restriction -> added in java 5 version
		ar1.add(10);
		//ar1.add('f');  // we wil get an error
	
		ArrayList<E> a2 = new ArrayList<E>(); // when we don't know what data type will be stored in array list
		
		Employee e1 = new Employee("hari", 22, "dev");
		Employee e2 = new Employee("san", 11, "qa");
		Employee e3 = new Employee("ram", 20, "go");
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		System.out.println(ar4.get(2).age);
		System.out.println("1111111111111111111111111111111");
		ar4.addAll(ar);// add the element of ar to ar4
		for(int i=0;i<ar4.size();i++) {
			System.out.println(ar4.get(i)); 			
		}
		System.out.println("1111111111111111111");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i)); 			
		}
		
		System.out.println("1111111111111111111");
		ar4.removeAll(ar);// remove the element of ar from ar4
		for(int i=0;i<ar4.size();i++) {
			System.out.println(ar4.get(i)); 			
		}
		
		ar.retainAll(ar1);// retain the common value from both
		
		System.out.println("1111111111111111111");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i)); 			
		}
		
		
	}

}
