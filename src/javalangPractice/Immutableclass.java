package javalangPractice;

final class intImutable{
	private int i;
		
	public intImutable(int i) {
		this.i=i;
	}
	public intImutable change(int o) {
		if(i==o){
			return this;
		}
		return (new intImutable(o));
	}
}

public class Immutableclass {
public static void main(String[] args) {
		intImutable i= new intImutable(10);
		intImutable i1= i.change(100);
		intImutable i2 =i.change(10); 
		
		System.out.println(i==i1);
		System.out.println(i==i2);
		
		
}
}
