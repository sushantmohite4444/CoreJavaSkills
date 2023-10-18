package collectionexamples;

import java.util.HashMap;
import java.util.WeakHashMap;
//In Case of HashMap, HashMap Dominates Garbage Collector. That is if Object doesn’t 
//have any Reference Still it is Not Eligible for Garbage Collector if it is associated with 
//HashMap. 

public class MapsecondExample {

	public static void main(String[] args) throws InterruptedException {

//		HashMap hm  = new HashMap();
		WeakHashMap hm =new WeakHashMap();
		Temp t =new Temp();
		hm.put(t, "sushant");
		System.out.println(hm);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hm);
	}
	
}
class Temp {
public String toString() {
return "temp";
}
public void finalize() {
System.out.println("finalize() Called");
}
}
