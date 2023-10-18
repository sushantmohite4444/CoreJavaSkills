package javalangPractice;


class first1 implements Cloneable {
	int i,j;
	public first1() {
		 i=11;
		 j=22;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Cloning implements Cloneable {
	int o=11;
	int t=12;

	public static void main(String[] args) throws CloneNotSupportedException {
		Cloning c =new Cloning();
		Cloning c1 = (Cloning)c.clone();
		System.out.println(c1.o + " "+c1.t);
		System.out.println(c.o + " "+c.t);
		c1.o=1213151;
		c1.t=123121;
		System.out.println(c1.o + " "+c1.t);
		System.out.println(c.o + " "+c.t);
		
		System.out.println();
				first1 f = new first1();
		first1 f2 = (first1)f.clone();
		System.out.println(f2.i + " "+f2.j);
		System.out.println(f.i + " "+f.j);
		f2.i=111111;
		f2.j=222222;
		System.out.println(f2.i + " "+f2.j);
		System.out.println(f.i + " "+f.j);
	}

}
