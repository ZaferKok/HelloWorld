package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion1 {

	public static void main(String[] args) {
	
		/*Type java code by using if-else statement,
		if the password is “JavaLearner”, output will be “The password is true”.
		Otherwise, output will be “The password is false”.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password, do not ignore cases");
		String password = scan.nextLine();
		
		if(password.equals("JavaLearner")) {
			System.out.println("The password is true");
		} else {
			System.out.println("The password is false");
		}
		// if else condition is more useful. because check the code once.
		
		 
		//if(password.equals("JavaLearner")) {
		//	System.out.println("The password is true");
		//if(!password.equals("JavaLearner")) {
		//	System.out.println("The password is false");
		//}		
		
	}
	
}
