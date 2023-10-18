package sorting;

public class Recursionexample {
	public static void print5to1(int n) {
		if(n ==0) {
			return ;
		}
		System.out.println(n);
		print5to1(n-1);
	}

	public static void main(String[] args) {
		print5to1(5);
		
	}
}
