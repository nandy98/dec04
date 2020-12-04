package javaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		h.put("name", "hari");
		h.put("age", 32);
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		h.put(2, 300);
		System.out.println(h.size());
		System.out.println(h.get("2"));
		System.out.println(h.get(2));
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 10);
		h1.put(2, 20);
		h1.put(4, 40);
		System.out.println(h1.size());
		System.out.println(h1.get(2));
		System.out.println(h1.get(4));
	}

}
