package collectionexamples;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector v =new Vector();
		v.add(12);
		v.addElement("sush");
		System.out.println(v.isEmpty());
		 Enumeration e = v.elements();
		 while(e.hasMoreElements())
		 {
			 System.out.println(e.nextElement());
		 }
	}
}
