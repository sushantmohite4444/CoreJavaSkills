package collectionexamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapthirdexample {

	public static void main(String[] args) {
		
		Hashtable m =new Hashtable();
		
		m.put( new tom(1), "A");
		m.put( new tom(2), "j");
		m.put( new tom(11), "e");
		m.put( new tom(12), "t");
		System.out.println(m);
		Set i = m.entrySet();
		Iterator j = i.iterator();
		while(j.hasNext()) {
			Map.Entry me = (Entry) j.next();
			System.out.println(me.getKey() + " "+ me.getValue()+ " " +me.hashCode());
	}

}
}

	class tom {
	int r;
	tom(int r){
		this.r=r;
	}
	
	public int hashCode() {
		return r;
	}
	
	public String toString() {
		
		return r+"";
	}
}
