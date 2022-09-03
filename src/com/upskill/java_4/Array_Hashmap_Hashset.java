package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset {

	//array store multiple data using index
	
	public static void main(String[] args) {
		
		int age = 30;  // this is variable,  in variable there will be 1 value
		int [] ageWolverine = new int[] {24, 28, 30, 35, 29, 40}; // in array there will be multiple values
		// Array index                  [0]  [1] [3] [4] [5] [6]       
		
		System.out.println("Array Age:"+ ageWolverine [2]);
		System.out.println("Total student:"+ ageWolverine.length);
		
		
		String[] nameWolverine = new String[] {"Ansarul", "Sheikh", "Omar", "Rushdi"};
		System.out.println("Student name:"+ nameWolverine[0]);
		
		
	// Multi-dimentional Array 
		
		int[][] ageWolverine2D= { {24, 28, 30, 35, 29, 40}, // [0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
		                          {35, 22, 27}};             // [1][0] [1][1] [1][2]
		
		                          System.out.println("Student Age 2D:" + ageWolverine2D[0][3]);
		
		// Hashmap store multiple data using key-value pair, implementation of map interface
		                          
		                          HashMap<String, Integer> Student = new  HashMap<String, Integer>();
		                          
		                          Student.put("Ansarul", 28);
		                          Student.put("Omar", 15);
		                          Student.put("Rushdi", 12);
		                          Student.put("Seikh", 40);
		                          Student.put("Liakat", 47);
		                          
		                     System.out.println("Student Age : " + Student.get("Omar"));    
		                         
		                     HashMap<String, String> Capital = new  HashMap<String, String>();
		                          
		                     Capital.put ("BD", "Dhaka");
		                     Capital.put ("USA", "Washington DC");
		                     
		                     System.out.println("Capital City : " + Capital.get("USA")); 
		                     
		  // Hashset store unordered collection containing unique value, implementation of set interface
		                     
		                     HashSet<String> car = new  HashSet<String>();
		                     
		                     car.add("BMW");
		                     car.add("Audi");
		                     car.add("Ford");
		                     System.out.println("Car : " + car); 
		 // Hashtable store multiple data using key-value pair, but is synchronized (only one thread can be modified)  
		                     
		                     Hashtable<String, String> Region = new  Hashtable<String, String>();
		                     
		                     Region.put ("BD", "Asia");
		                     Region.put ("USA", "North America");
		                     System.out.println("Region : " + Region.get("USA"));
		                     
		                     
		                         	}
		                         	}

		                          
		                          
		                          
		                          
		                         	
	
	



