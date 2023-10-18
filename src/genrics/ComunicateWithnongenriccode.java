package genrics;

import java.util.ArrayList;

import collection.Array;

public class ComunicateWithnongenriccode {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("sushant");
		method(al);
		System.out.println(al);
	}
	public static void method(ArrayList l) {
		l.add(10);
		l.add("sushant");
		l.add(10.3);
	}

}
