package collectionexamples;

//In HashMap JVM will Use .equals() to Identify Duplicate Keys, which is Meant for 
//ContentComparision.
// In IdentityHashMap JVM will Use == Operator to Identify Duplicate Keys, which is Meant 
//for Reference Comparison.

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Mapexample {
	public static void main(String[] args) {
		IdentityHashMap hm =new IdentityHashMap();
//		HashMap hm =new HashMap();
		Integer i=new Integer(10);Integer j=new Integer(10);
		hm.put(i, "sushant");
		hm.put(j, "vikas");
		System.out.println(hm);
	}
}
