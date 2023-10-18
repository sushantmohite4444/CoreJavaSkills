package thread;

class O extends Thread  {
	static Thread tm; //to access variable using only class name(static)
	
	@Override
	public void run() {
		try {
			tm.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<50;i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Joinsleep {
	public static void main(String[] args) throws InterruptedException {
		O.tm= Thread.currentThread();// returns the currently executing thread.
		O o =new O();
		o.start();
		//o.join(); //for completion child thread
		for (int i = 0; i < 50; i++) {
			
			Thread.sleep(1000);
			System.out.println("main thread");
		}
	}

}
