package com.upskill.java_2;

public class IFElseStatement {

	
	static int age = 66;
	
	public static void main(String[] args) {
		age();
		

	}
	
public static void age(){
	
	if (age < 13){
		System.out.println("Your are children");
	} 
	
	else if (age > 13 && age < 18) {
		System.out.println("Your are Teenager");
	} 
	
	else if (age > 60) {
		//Nested If Else Statement
		
		if(age >100) {
			System.out.println("You are Hero");
	}
		
		else{
		System.out.println("You are Senior");
			System.out.println("You are Senior Citizen");
		}
	} 
	
	else {
		System.out.println("You are Senior");
	}
}
// Test git
}

