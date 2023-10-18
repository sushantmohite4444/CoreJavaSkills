package innerClassorInterface;

public class InnerInterface {
	
	interface i{
		public int NoOfWheels();
	}
  class RollsRoyals implements i{

	@Override
	public int NoOfWheels() {
		return 4;
	}
	  
  }
  class audi implements i {

	@Override
	public int NoOfWheels() {
		return 4;
	}
	  
  }
  class shine implements i{

	@Override
	public int NoOfWheels() {
		return 2;
	}
	  
  }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
