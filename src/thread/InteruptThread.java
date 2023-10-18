package thread;
//class io implements Runnable {
//
//	@Override
//	public void run() {
//		for(int i=0 ;i<=10;i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	
//}
//public class InteruptThread {
//	public static void main(String[] args) {
//		
//		io o =new io ();
//		Thread t =new Thread(o);
//		t.start();
//		t.interrupt();
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}	
//	}
//
//}

class io extends Thread {
	
	@Override
	public void run() {
		try {
		for(int i=0 ;i<=10;i++) {
			System.out.println(i);
					Thread.sleep(2000);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

public class InteruptThread {
	
	public static void main(String[] args) {
		io o =new io();
		o.start();
		o.interrupt();
		for(int i=0 ;i<=10;i++) {
			System.out.println(i);
	}
	}
	
}

