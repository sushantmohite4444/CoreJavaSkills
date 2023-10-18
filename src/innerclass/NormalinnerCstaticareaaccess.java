package innerclass;

public class NormalinnerCstaticareaaccess {
	
	
	class inner {
		int i=4444;
		public  void print() {
			System.out.println("Inside print method of inner class");
		}
		
	}

	public static void main(String[] args) {
		NormalinnerCstaticareaaccess ncsa =new NormalinnerCstaticareaaccess();
		inner in = ncsa.new inner();
		System.out.println(in.i);
		in.print();
	}

}
