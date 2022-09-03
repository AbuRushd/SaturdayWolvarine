package com.upskill.java3;
/* Constructor is instance of class, method same as class name, java will execute constructor first
 * Constructor can not be static or override nor void or return type,
 * Default constructor: no constructor is initiated
 * Parameterized constructor: add different signature
 * Constructor overloading: different signature 
 */
public class Constructor {

	String admin;
	int adAge;
	
	public Constructor(String name, int age){
		admin = name;
		adAge = age;
	}
	
	public static void main(String[] args) {
		Constructor myObj = new Constructor("Rushdi",35);
		
		System.out.println(myObj.admin);
		System.out.println(myObj.adAge);

	}

}
