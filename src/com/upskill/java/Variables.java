----- HelloWorld --------

package com.upskill.java_1;

public class HelloWorld {

	public static void main(String[] args) {
		
	
			System.out.println("Hello World, This is Rasel");
			System.out.println("Welcome to coding !");
			
			int a = 55;
			int b = 8;
			int c = a+b;
			System.out.println(c);
			
			String city = "Newyork";
			String state = "NY";
			System.out.println(city);
			System.out.println(state);
			
			boolean isGood = true;
			System.out.println(isGood);
			
			
			HelloWorld myObject = new HelloWorld();
	}
}

// Access Modifier --------

package com.upskill.java_1;

public class AccessModifier {
	
	//Different Access Modifiers in Java
	
	public String name = "Rasel";			// public - Any class can access 
	
	private int age = 55;					// private - Only same class can access
	
	protected int ssn = 123456789;			// protected - classes in the same package and subclass
	
	String address = "Heritage Tower";	    // default - classes in same package can access


}

------ Variable --------

package com.upskill.java_1;

public class Variables {
	
//	Variables in Java
	
	public String country = "USA";				//Instance OR global variable - Variables declared in Class level, outside method
	
	public static String region = "America";	//Static variable - variables belong to class and don't required creating object

	public static void main(String[] args) {
		
		String city = "NewYork"; 				//Local variable - variables declared in methods 
	}
	
	public void method (String county){			//Method parameter - variables used as method parameter
		String myCounty = county;
	

}

	}


