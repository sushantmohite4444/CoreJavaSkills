package thread;
class A{
	public synchronized void display(String s) {
		for(int i=0;i<10;i++) {
			System.out.println(s);
		}
	}
}
class B extends Thread {
	int a=0;
	String name;
	A obj;
	public B(String name ,A obj) {
		this.name=name;
		this.obj=obj;
	}

	
	@Override
	public void run() {
//		if(hashCode()== 366712642) {
//		Thread.currentThread().setName("b1 thread");
//		System.out.println("second thread name is" + Thread.currentThread().getName());
//		}
//		else
//		{
//			Thread.currentThread().setName("b2 thread");
//			System.out.println("Thred thread name is" + Thread.currentThread().getName());
//		}
			
		obj.display(name);
	 
	}
}

public class Synchronized {
	public static void main(String[] args) throws InterruptedException {
		
		A a =new A();
		 System.out.println("first thread name is" + Thread.currentThread().getName());
		System.out.println();
		B b1 =new B("dhoni",a);
		B b2 =new B("yuvaraj",a);
		System.out.println("hashCode for  object" + b1.hashCode() + " "+ b2.hashCode());
	
		b1.start();
		b2.start();		
	}

}
