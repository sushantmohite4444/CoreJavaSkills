package enumexample;



		enum Beer
		{
		KF(100),KO(70),RC(65),Fo(90),KALYANI;
		int price;
		Beer(int price){
		this.price=price;
		}
		Beer()
		{
		this.price=125;
		}
		public int getPrice()
		{
		return price;
		}
		}
		public class ConstructorEnum {
		public static void main(String args[]){
//			Beer b=Beer.KO;
			
			Beer[] b=Beer.values();
		for(Beer b1:b)
		{
		System.out.println(b1+"......."+b1.getPrice());
		}
		}
		}


	