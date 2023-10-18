package first.pack;

//abstract strictfp class dog{
//	
//}
public  class Classconcept extends test{ //child class call parent class main method
	 int i=10;
	 static int j=200;
	 public void ok() {
		 System.out.println(i+" "+j); 
	 }
	 static void guest() {
		 Classconcept c= new Classconcept();
		 System.out.println(c.i+ " "+ j);
	 }
}
	 
	 
 class test{
		 
	 
public static void main(String[] args) {

	//	System.out.println(i); cant access instance variable without crating object in static area

	System.out.println(Classconcept.j);
	 Classconcept c= new Classconcept();
	 c.ok();
	 Classconcept.guest();
}

}
