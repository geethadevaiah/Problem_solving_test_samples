package Threads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	/**
	 * ExecutorService interface, java.util.concurrent.ExecutorService, represents
	 * an asynchronous execution mechanism which is capable of executing tasks
	 * concurrently in the background.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// factory method creates a thread pool with 10 threads executing tasks.
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		// the implementation of the ExecutorService interface present in the
		// java.util.concurrent package is a thread pool implementation.

		// an anonymous implementation of the Runnable interface is passed to the
		// execute() method.
		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("Asynchronous task");
			}
		});

		executorService.shutdown();

		/*
		 * few different ways to delegate tasks for execution to an ExecutorService:
		 * 
		 * execute(Runnable) -- method takes a java.lang.Runnable object, and executes it asynchronously.
		 * submit(Runnable) -- method also takes a Runnable implementation, but returns a Future object. This Future object can be used to check if the Runnable has finished executing.
		 * submit(Callable) -- method is similar to the submit(Runnable) method except it takes a Java Callable instead of a Runnable. 
		 * invokeAny(...)-- method takes a collection of Callable objects, or subinterfaces of Callable. Invoking this method does not return a Future, but returns the result of one of the Callable objects. You have no guarantee about which of the Callable's results you get. Just one of the ones that finish.
		 * invokeAll(...)-- method invokes all of the Callable objects you pass to it in the collection passed as parameter. The invokeAll() returns a list of Future objects via which you can obtain the results of the executions of each Callable.
		 */
	}

}
