package com.upskill.java_6;

public class Singleton {

	// Singleton is class that can have only one object.
	
	// Private constructor, it prevents any other class from instantiating
	
	private Singleton() {
		
	}
	// Private static object of the class
	private static Singleton Singletonobj = new Singleton ();
	
	// Static instance method
	public static Singleton getInstance() {
		return Singletonobj;
	}
	
	protected static void demo() {
		System.out.println("Demo method for Singleton class");
	}
}
