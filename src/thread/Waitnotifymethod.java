package thread;

public class Waitnotifymethod {
public static void main(String[] args) throws Exception {
	
	thread1 th =new thread1();
//	thread1 td =new thread1();

	th.start();
	synchronized(th){ //main thread lock th object
		System.out.println("befor wait method");
		th.wait();   // main thread waiting state ;
		System.out.println("after wait method");
		System.out.println(th.c);
	}
	
//	td.start();
//	synchronized(td){ //main thread lock th object
//		System.out.println("befor wait method");
//		td.wait();   // main thread waiting state ;
//		System.out.println("after wait method");
//		System.out.println(td.c);
//	}
}	
}
class thread1 extends Thread  {
 int c=0;
	@Override
	public void run() {
		synchronized(this) { //child thread locks  th object 
			System.out.println("in child");
			for(int i=0;i<=100;i++) {
				c+= i;
				}
			System.out.println("before notification");
			this.notifyAll();
			System.out.println("after notification");
		}
		}
	}
	