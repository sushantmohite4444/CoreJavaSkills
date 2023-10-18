package thread;

class Q {
	
	public synchronized void first(W w) throws InterruptedException {
		 Thread.sleep(20000);
		w.last();
	}
	public synchronized void last() {
		 System.out.println("Q last");
	 }
}

class W{
	 public synchronized void first(Q q) throws InterruptedException {
		 Thread.sleep(20000);
		 q.last();
		 
	 }
	 public synchronized void last() {
		 System.out.println("W last");
	 }
}

public class Deadlock implements Runnable {
	Q q = new Q ();
	 W w =new W ();
	 Deadlock() throws InterruptedException{
		 Thread t = new Thread (this);
		 t.start();
		 w.first(q);
	 }
	
	public static void main(String[] args) throws InterruptedException {
	 new Deadlock();
	 
	}
	@Override
	public void run() {
		
	try {
		q.first(w);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	};
		
	}

}
