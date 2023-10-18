//with static method hiding 
//with non static method overriding
package oops;
class ap {
	public static void ok() {
	System.out.println("i am is in parent");
	}
}
class mb extends ap{
	public  static void ok() {
		System.out.println("i am is in child");
		}
}

public class Methodhidingandmethodoverloading {
	public static void main(String[] args) {
		 ap A =new mb();
			A.ok();
	}

}
