package sorting;

public class Recursionexample1 {
	public static void sum(int sum,int n) {
		if(n==0) {
			System.out.println(sum);
			return;
		}
		sum += n;
		sum(sum,n-1);
		
		
	}
	public static void main(String[] args) {
		int n=5,sum=0;
		 sum(sum,n);
	}

}
