package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Demo {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(2);
		ls.add(4);
		ls.add(5);		
		ls.add(6);
		ls.add(9);
		ls.add(3);
		System.out.println(ls);
		Collections.sort(ls);
		ls.forEach(n -> System.out.println(n));
		

	}

}
