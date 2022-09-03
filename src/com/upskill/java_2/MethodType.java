package com.upskill.java_2;

public class MethodType {

	/* 3 types of method:
	        1.Void Method
	        2.Static Method
	        3.Return Type Method */
	
	public static int hourlyIncome = 65;
            
	public static void main(String[] args) {
		MethodType myObj = new MethodType();
		myObj.annualIncomeVoid();
		
weeklyIncomeStatic();
System.out.println("My Monthly Income = " + myObj.monthlyIncomeReturn());


int a = ReturnOne();
int b = ReturnTwo();
int c = (a-b);
System.out.println("The return value is " + c);
	}

	// Void Method
	
	public void annualIncomeVoid (){
	int calculateAnnualIncome = hourlyIncome * 2000;
	System.out.println ("My Annual Income = " + calculateAnnualIncome);
}
	
	//static Method
	public static void weeklyIncomeStatic(){
		int calculateweeklyIncome = hourlyIncome * 40;
		System.out.println ("My Weekly Income = " + calculateweeklyIncome);
				
	}
	
	//return type Method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 100;
		return calculateMonthlyIncome;
		
		
	}
	public static int ReturnOne() {
		return 30;	
	}
	public static int ReturnTwo() {
		return 20;
	}
}
