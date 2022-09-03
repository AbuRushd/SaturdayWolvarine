package home.work.assignment;

public class Assignment2 {

	public static void main(String[] args) {
		/*Problem 02: A rectangle width and length are: 9 and 13 inches.
		Write a method to display the perimeter of rectangle in console output. */
		Perimeter1();
		Assignment2 obj = new Assignment2 ();
		obj.Perimeter2();
		

	}
	public static void Perimeter1() {
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
		System.out.println("Perimeter " + c);
	}
	public void  Perimeter2() {
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
		System.out.println("Perimeter " + c);
	}
}
