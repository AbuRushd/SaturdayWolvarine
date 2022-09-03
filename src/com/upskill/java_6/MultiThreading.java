package com.upskill.java_6;

public class MultiThreading {

/* Multi-threading is a Java feature that allows concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface */
	
	public static void main(String[] args) {
		
	int n = 2;   					// Number of threads
	for (int i = 0; i<n; i++) {
	MultiThreadingDemo obj = new MultiThreadingDemo ();				// Obj for Extending the Thread Class  (we use extend cause inheritance)
	Thread obj2 = new Thread (new MultiThreadingDemo2()); 			// Obj for Implementing the Runnable Interface (we use implement cause interface)
	obj.start();
	obj2.start();
}
	}

}
class MultiThreadingDemo extends Thread {							//  Extending the Thread class 
	public void run () {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}
class MultiThreadingDemo2 implements Runnable {						//  Implementing the Runnable Interface 
	public void run () {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

