package test;
class test  extends Methodhidding {
	public static void main(String[] args) {
		System.out.println("I am parent main");
	}
}

public class Methodhidding {

	public static void main(String[] args) {
		System.out.println("I am child main");
	}

}
