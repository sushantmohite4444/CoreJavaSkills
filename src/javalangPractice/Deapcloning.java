package javalangPractice;



// both primitive and primitive variable cloning object created 

class human1{
	 String gender;
	 public human1(String gender) {
		this.gender=gender;
	}

}
class malewoman1 implements Cloneable{
	
	int age;
	human1 h;
	public malewoman1(human1 h,int age) {
		this.age=age;
		this.h=h;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		human1 h1 = new human1(h.gender);
		malewoman1 o =new malewoman1(h1, age);
		return o;
	}
}

public class Deapcloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		human1 h= new human1("male");
		malewoman1 m =new malewoman1 (h,23);
		
		malewoman1 m1= (malewoman1)m.clone();
		System.out.println(" main object == "+m.age + " ," + m.h.gender);
		System.out.println(" cloning object == "+m1.age + ", " + m1.h.gender);
		m1.h.gender="female";
		m1.age=27;
		
		System.out.println();
		System.out.println(" main object after chang in cloneobj == "+m.age + " ," + m.h.gender);
		System.out.println(" cloning object after chang in cloneobj == "+m1.age + ", " + m1.h.gender);
		
	}

}
