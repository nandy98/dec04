package javaBasics;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");
		ll.add("QA");
		ll.add("dev");
		System.out.println(ll);
		ll.addFirst("admin");// add first element
		System.out.println(ll);
		ll.addLast("selenium");// add last element
		System.out.println(ll);		
		System.out.println(ll.get(2));
		ll.set(2, "10");
		System.out.println(ll.get(2));
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		
		for(String str: ll) {
			System.out.println(str);
		}
	}

}
