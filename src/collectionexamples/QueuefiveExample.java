package collectionexamples;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueuefiveExample {
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		for(int i=0;i<10;i++) {
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}
}
