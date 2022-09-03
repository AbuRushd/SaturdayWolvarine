package home.work.assignment;

public class NewAssignment3 {

public static int a;
public static int b;

	public static void main(String[] args) {
		/* Problem3. Write two java functions which will return two different integer values,    
		write a program to compare those numbers and send message that one number is bigger than other. 
		(hints: using if..else)*/
		a = Function1();//40
		b = Function2();//50
		myMethod();
        System.out.println(a);
        System.out.println(b);

        

	}
	public static int Function1(){
		return 40;
	}
	public static int Function2(){
		return 50;
	}
	public static void myMethod(){
		if (a>b){
			System.out.println("1st number is bigger then 2nd number");
			}
		if (a<b){
			System.out.println("2nd number is bigger then 1st number");
			}
	}
}
