package sorting;

public class Recursionexmple2 {
	public static void fact(int n,int fact) {
		if(n==0) {
			System.out.println(fact);
			return;
		}
		fact *=n;
		fact(n-1,fact);
	}
	public static void main(String[] args) {
		int n=11 ,fact=1;
		fact (n ,fact);
	}

}
