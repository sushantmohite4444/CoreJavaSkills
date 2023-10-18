	package collectionexamples;
	
	import java.util.List;
	import java.util.ListIterator;
import java.util.TreeSet;

import javax.print.attribute.IntegerSyntax;

import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collection;
	import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
	
	public class Arraylistmethod {
	
		public static void main(String[] args) {
			 Integer j[] = {1,4,2,34,5,2,6,7,8};
			 List lm = Arrays.asList(j);
//			 lm.add(10); lm and j pointing  at same location we can't change size of array
			 
			 List ls= Arrays.asList(2,6,8);
			 
			ArrayList<Integer> i = new ArrayList(Arrays.asList(j));
			
//			ArrayList<Integer> i = new ArrayList();
//			Collections.addAll(i, j);
			
			 ArrayList<Integer> newal=new ArrayList<>();
	//		i.retainAll(ls);
		
			ListIterator<Integer>a =i.listIterator();
			while (a.hasNext()) {
				int e =a.nextIndex();
				int n =a.next();
				if(n!=2 && n!=4 && n!=6) {
				    newal.add(e);
//				    i.remove(e);z
				}
	//			newal.add(a.next());
			}
			
	//		int delete =newal.size();
	//		for(int w=0;w < delete; w++) {
	//			int lf =newal.get(w);                   error due to runtime delete fist then index change
	//			System.out.println();                       
	//			System.out.println(lf);
	//		}
			
	//		Iterator<Integer>m =i.iterator();
	//		while (m.hasNext()) {
	//			System.out.println(m.next());
	//		}
	//// to convert arraylist  to array use toArray() method of collection class 
	//		Object am[]= newal.toArray();
			Collections.reverse(i);
//			{1,4,2,34,5,2,6,7,8};
			System.out.println(i);
			System.out.println(i);
			Collections.sort(i);
			System.out.println(i);
			System.out.println("Index of first occurance 34 is ="+Collections.binarySearch(i, 34)); //return index of that object
			TreeSet<Integer>  t= new TreeSet<Integer>(i);
			System.out.println(t.descendingSet());
			System.out.println(new Date());
			
		}

	}
