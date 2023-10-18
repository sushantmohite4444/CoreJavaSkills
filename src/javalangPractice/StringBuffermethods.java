package javalangPractice;

import java.lang.reflect.Method;

public class StringBuffermethods {

	public static void main(String[] args) {
		int count=0;
		StringBuffer sb= new StringBuffer();
		StringBuffer sb1= new StringBuffer("qwe");
		System.out.println("length " +sb1.length()+" + 16 = capacity= " +sb1.capacity());
		sb.append("qwertyuiopasdfgh");
		System.out.println(sb.capacity());
		sb.append("j");
		System.out.println(sb.capacity());
		sb.trimToSize();//to free extra allocated memory
		System.out.println(sb.capacity());
		StringBuffer sb2 =sb1.append(sb1);
		System.out.println(sb2);
   
//		Class c = sb.getClass();
//		Method m[]= c.getDeclaredMethods();
//		for(Method m1: m) {	count++;System.out.println(m1);}
//		System.out.println(count);
	}

}
