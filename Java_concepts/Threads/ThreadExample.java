package Java_concepts.Threads;
/**
 * 
 * Extending the thread class
 * @author Dell
 *
 */
class ThreadExample extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		ThreadExample t1 = new ThreadExample();
		t1.start();
		
		Multi3 m1 = new Multi3();
		Thread t2 = new Thread(m1);
		t2.start();
	}
}

/**
 *
 * By Runnable interface
 *
 **/

class Multi3 implements Runnable {
	public void run() {
		System.out.println("thread is running...1111");
	}

//	public static void main(String args[]) {
//		Multi3 m1 = new Multi3();
//		Thread t1 = new Thread(m1);
//		t1.start();
//	}
}
