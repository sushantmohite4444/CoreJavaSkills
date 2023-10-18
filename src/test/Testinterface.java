	package test;
	
	public interface Testinterface {
	 void m1();
	 default void  m2() {
		 System.out.println("default run from java8");
	 }
	 static void  m3() { 
		 System.out.println("static run from java9");
	 }
	}
