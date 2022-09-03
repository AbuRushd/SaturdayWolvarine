package com.upskill.java3;

public class Loops {

	/* types of Loops:
	 1. For loop
	 2. While Loop
	 3. Do while loop
	 4. Infinite loop
	 
	 */
	public static void main(String[] args) {   
		practiceforloop();
		practiceWhileLoop();
		practiceDoWhileLoop();
		practiceInfinieLoop();
		practiceNestedForLoop();
		multiplicationTable();
	}
	public static void practiceforloop() {                        // for loop - Do again and again up to upper limit
		int i;                                                    // Initialize the variable
		for(i=1; i<=10; i++){                                     // Setting lower limit, upper limit, increment or decrement
		System.out.println("For loops Numbers = " + i);           // Statement or result
		}
	}

	public static void practiceWhileLoop() {                      // while loop - do again and again up to condition match
	     int i = 1;                                               // initialize the variable
		while (i<=100) {                                          // setting condition
			System.out.println("While loops Numbers = " + i);     // statement or result
			i++;                                                  // increment or decrement
		}
}
	public static void practiceDoWhileLoop() {                    // Do while loop - do action then match condition
	     int i = 1; 											  // Initialize the variable
		 do {													  
			 System.out.println("Do While loops Numbers = " + i); // statement or result
			 i++;												  // increment or decrement
			 }while (i<=100);									  // checking condition
		 }
	public static void practiceInfinieLoop() { 					  // Infinite loop - never ending loop
		  int i = 1; 											  // Initialize the variable
		  for (i=1; ; i++) {									  // setting no upper limit
			  System.out.println("Infinite loops Numbers = " + i);// Statement or result
		
	}
}
	public static void practiceNestedForLoop() {  			      // Nested loop = Loop inside another loop
		 int i;                                                   // Initializing variable i
		 int j;										              // Initializing variable j
		 for (i=1; i<=10;i++) {                                   // first loop for i
			 for(j=1; j<=10;j++) {					              // second loop for j
				 System.out.println("Nested for loops Numbers = " + i+";"+j); // statement or result for j loop
			 }
			 System.out.println("increase value of i =>"+i); // statement or result for i loop
		 }
	}
	public static void multiplicationTable() {
	for (int row=1; row <=10; row++) {
		for (int col = 1; col <=10; col++) {
			int table = row * col;
			System.out.println(table + "");
		}
		System.out.println("");
	}
	
	}
	
	
	
	

}
