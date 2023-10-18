package javalangPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
public class Getclassmethodofobjclass {

	public static void main(String[] args) {
		int count=0 ;
		int count1=0;
		Object o= new ArrayList<>();
		Class c = o.getClass();
		Method mc[]= c.getDeclaredMethods();
		int i=0;
		for(Method m :mc) {
			System.out.println( ++i +" "+m.getName());
		}
		System.out.println(c.getName());
		Method m[] =c.getDeclaredMethods();
		for(Method m1:m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println(count);
		Constructor[] r =c.getConstructors();
		
		for (Constructor t :r) {
			count1++;
			System.out.println(t);
		}
		System.out.println(count1);
	}

}
