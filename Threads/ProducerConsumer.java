package Threads;

import java.util.LinkedList;

public class ProducerConsumer {
	
	public static void main(String[] args) {
		
		// create pc object
		final pc pc = new pc();
		
		Thread t1 = new Thread(() -> {
			pc.produce();
		});
		Thread t2 = new Thread(() -> {
			pc.consume();
		});
		
		try {
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
		}
		catch(InterruptedException e){}
	}

	public static class pc {

		LinkedList<Integer> q = new LinkedList<Integer>();
		int SIZE = 2;

		// produces (adds item to the list)
		public void produce(){
			
			int value = 0;
			while(true) {
				try {
					synchronized (this) {
						// check if the list is not full
						System.out.println("q size " + q.size()+" "+SIZE);
						while(q.size() == SIZE) 
							wait();
						System.out.println("Adding to the list -> "+value);
						// add to the list
						q.add(value++);
						// notify the consumer that it is not empty
						notify();
						// for the program to understand 
						Thread.sleep(1000);
					}
				}catch(InterruptedException e) {}
			}
		}

		// consumer function
		public void consume() {
			while(true) {
				try {
					synchronized (this) {
						// check whether the list is empty
						System.out.println("in c q size " + q.size());

						while(q.size() == 0) 
							wait();
						int val = q.removeFirst();
						System.out.println("consuming the item from the list -> "+ val);
						// notify the producer
						notify();
						Thread.sleep(1000);
					}
				}catch(InterruptedException e) {}
			}
		}
	}

}
