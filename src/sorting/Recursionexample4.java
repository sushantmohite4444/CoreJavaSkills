package sorting;

public class Recursionexample4 {
	public static int xPow(int a,int n) {
		if(n==1)
			return 1;
		if(n==0)
			return 1;
		
		int xPow=xPow(a,n-1);
		int xPow2=a*xPow;
		return xPow2;
	}
	public static void main(String[] args) {
		int x=9,n=8;
		int ans =xPow( x ,n);
		System.out.println(ans);
	}

}
