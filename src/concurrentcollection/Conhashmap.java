package concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class Conhashmap {
	public static void main(String[] args) {
		ConcurrentHashMap sm = new ConcurrentHashMap ();
		 sm.put(1, "sushant");
		 sm.put(1, "sush");
		 System.out.println(sm);
		 sm.putIfAbsent(1,"sushant");
		 System.out.println(sm);

		
	}
}
