package DesignPatterns.Creational_DP.Singleton;

public class SingletonExample {
	
	// private default constructor
	private SingletonExample() {}

	
	public static  SingletonExample INSTANCE = new SingletonExample();
	
	public static SingletonExample getInstance() {
		if(INSTANCE == null)
			INSTANCE = new SingletonExample();
		return INSTANCE;
	}
	
	
	// for multithreaded
	public static synchronized SingletonExample getInstanceSynchronised() {
		return SingletonExample.getInstance();
	}
	
	/**
	 * Eager instantiation  -- object created at the runtime itself
	 * public static final SingletonExample INSTANCE = new SingletonExample();
	 * 
	 * public static SingletonExample getInstance() {
		return INSTANCE;
		}
	 * 
	 */
	
	
	/**
	 * On Demand Instantiation
	 * public static SingletonExample INSTANCE = null;
	 * 
	 * public static SingletonExample getInstance() {
			if(INSTANCE == null)
				INSTANCE = new SingletonExample();
			return INSTANCE;
		}
	 */
}


