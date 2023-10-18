package oops;
	

//	class a{
//		public void method() {
//			System.out.println("sushant A");
//		}
//	}
//	class b extends a{
//		@Override
//		public void method() {
//			System.out.println("sushant B");
//		}
//	}
//	class c extends b{
//		@Override
//		public void method() {
//			System.out.println("sushant obj");
//		}
//	}

	class a{
		public static  void method() {
			System.out.println("sushant A");
		}
	}
	class b extends a{
	
		public static void method() {
			System.out.println("sushant B");
		}
	}
	class c extends b{
		
		public static void method() {
			System.out.println("sushant obj");
		}
	}
	
//class d extends d{ Cycle detected: the type d cannot extend/implement itself
	                  //or one of its own member types
//		
//		public static void method() {
//			System.out.println("sushant obj");
//		}
//	}

public class Methodoverridingmethodhidding {

	public static void main(String[] args) {
		
		c C = new c();
		
		C.method();
		((b)C).method();
		((a)(b)C).method();
		

	}

}
