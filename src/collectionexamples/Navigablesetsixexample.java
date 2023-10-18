package collectionexamples;

import java.util.TreeSet;

import javax.print.attribute.IntegerSyntax;

public class Navigablesetsixexample {
	public static void main(String[] args) {
		 TreeSet< Integer> t= new TreeSet<Integer>();
		 t.add(101); t.add(2101); t.add(1022); t.add(102); t.add(103); t.add(104); t.add(105);
		 System.out.println(t);
		 System.out.println(t.descendingSet());
		 System.out.println(t.higher(1000));
		 System.out.println(t.floor(30000));
	} 
	
}
