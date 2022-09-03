package com.upskill.java_5;

public class Encapsulation {

	//Encapsulation is used to hide data or provide limited access as per requirement using setter and getter method
	
	private String name = "upskill";			// write & read
	private int ssn = 45358475;					// write only 
	private String username = "AbuMdRusdhi";	// read only
	
	
	// Setter Method - name
			public void setName(String value) {    // set the data
				name = value;
			}
	// Getter Method
				public String getName () {
					return name;
						}
				
	// Setter method - ssn (Socaial Secur
				public void setSSN(int value) {       // set the data
					ssn = value;
				}
				
	// Getter method
				public String getUserName() {     // get the data
					return  username;
				}
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.setName("AbuMdRushdi");
		System.out.println(obj.getName());
		
		System.out.println(obj.getName());
		obj.setSSN(45358475);
		obj.getUserName();
		System.out.println(obj.getUserName());
		
		
	}

	}	

