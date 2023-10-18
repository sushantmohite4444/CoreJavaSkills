package javalangPractice;

import java.util.ArrayList;


public class Wraperclass {
	
	public static void methodone(Long a) {
		System.out.println("widning"); // widening then  autoboxing 
	}
	
	public static void methodone(Number a) {
		System.out.println("widning"); //autoboxing then widening
	}
	public static void main(String[] args) {
		methodone(10);
		Integer w= new Integer(10);
		ArrayList  e=new ArrayList();
		e.add(Integer.valueOf(10));
		e.add(Integer.valueOf(11));
		e.add(Integer.valueOf(12));
//				e.add(10);               // auto un boxing in 1.5 version
		System.out.println(e);
//		int p=w.intValue(); //begfore 1.4 version need to typecast 
//		int p =w; //autounboxing and autoboxing concept come after 1.5 version 
//		System.out.println(p);
		
//		int i=10 ; //valid 
//		 Integer I=10 ; //valid 
//		 int i1=10L ; //invalid CE : 
//	     Long l = 10L ; // valid 
//		 Long l2= 10 ; // invalid CE : 
//		 long l1 = 10 ; //valid 
//		 Object o=10 ; //valid (autoboxing followed by widening)
//		 double d=10 ; //valid 
//		 Double d2=10 ; //invalid 
//		 Double d1=10d ; //valid
//		 Number n=10;
		
	}

}
