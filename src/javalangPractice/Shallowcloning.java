package javalangPractice;

import java.util.Collection;

// Reference variable cloning object not be created but primitive variable cloning object  be created

class human{
	 String gender;
	 public human(String gender) {
		this.gender=gender;
	}

}
class malewoman implements Cloneable{
	
	int age;
	human h;
	public malewoman(human h,int age) {
		this.age=age;
		this.h=h;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Shallowcloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		human h= new human("first m");
		malewoman m =new malewoman(h,23);
		
		malewoman m1= (malewoman)m.clone();
		System.out.println(" main object "+m.age + " ," + m.h.gender);
		System.out.println(" cloning object "+m1.age + ", " + m1.h.gender);
		
		m1.h.gender="second m";
		m1.age=27;
		
		System.out.println();
		System.out.println(" main object after chang in cloneobj  age= "+m.age + " ," + m.h.gender);
		System.out.println(" cloning object after chang in cloneobj age = "+m1.age + ", " + m1.h.gender);
	}

}
