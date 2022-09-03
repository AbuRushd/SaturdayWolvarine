package com.upskill.java_4;

public class Polymorphism extends MethodType{

	public static int hourlyIncome ;
	/* Polymorphism is the ability of an object to take on many forms
	 * Method overloading (compile time poymorphism/static binding) same method name with different signature to overload
	 * Method overridding (Routine Polymorphism,Dynamic binding) same method name from parent class to override
	 */
	public static void main(String[] args) {
		car();
		car(4);
		car(4,4);
		car("Red");
		
		weeklyIncomeStatic();
		
// * Method overloading (compile time polymorphism/static binding)
// same method name with different signature to overload
	}

public static void weeklyIncomeStatic() {
	int hourlyIncome = 75;
	int calculateWeeklyIncome = hourlyIncome * 40;
	System.out.println ("My Weekly Income = " +calculateWeeklyIncome);
	
	int businessIncome = 2000;
	int newIncome =  calculateWeeklyIncome + businessIncome;
	System.out.println ("My Weekly Income including Business = " + newIncome);
}
public static void car() {
	
	System.out.println("My car is Audi");
}
public static void car(int door) {
	System.out.println ("My car is Honda Civic, it has door: " + door);
}
public static void car(int door, int wheel) {
	System.out.println ("My car is Honda Civic, it has door: " + door + "WHEEL : " + wheel);
}
public static void car(String color) {
	System.out.println("My car is Honda Civic, it is nicely colored: " + color);
}
//Method overridding (Routine Polymorphism,Dynamic binding) 
//same method name from parent class to override
}



