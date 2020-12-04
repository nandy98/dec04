package javaBasic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		String names[] = {"hari","raj","hari","sohan","raj"}; 
//		for(int i=0;i<names.length;i++) {
//			for(int j=i+1;j<names.length;j++) {
//				if(names[i]==names[j]) {
//					System.out.println("duplicate is " + names[i]);
//				}
//			}
//		}
		
		
		/*Set<String> store = new HashSet<String>();
		for(String name:names){
			if(store.add(name)==false) {
				System.out.println("duplicate is " + name);
			}
		}*/
		
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		for(String name: names) {
			Integer count = storeMap.get(name);
			if(count==null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
		}
		
	
		}

}
