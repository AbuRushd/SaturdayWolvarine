package com.upskill.java3;

import com.upskill.java_2.MethodType;
/* The process of obtaining the data members and methods from one class to another is known as inheritance.
 * Single inheritance ( father & child)
 * Multiple inheritance (Java does not support multiple inheritance directly rather though interfaces) (father, mother & child)
 * Multilevel inheritance (father, grand father & child class)
 */
public class Inheritance extends MethodType{

	public static void main(String[] args) {
		Inheritance myObj = new Inheritance();
		myObj.annualIncomeVoid();
		myObj.weeklyIncomeStatic();
	}

}
