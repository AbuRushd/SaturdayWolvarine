package com.upskill.java_6;

public class MyException extends Exception{

	String a;
	
	public  MyException (String b) {
		 a = b;
		 
	}
public String Upskill() {
	return("This is User Defined Exception" + a);
}
}
