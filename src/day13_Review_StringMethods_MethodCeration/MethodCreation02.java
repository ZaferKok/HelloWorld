package day13_Review_StringMethods_MethodCeration;

import java.util.Scanner;

public class MethodCreation02 {

	public static void calculator() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two nuber for calculate");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Enter opeation as +,x,- or /");
		char c = scan.next().charAt(0);
		
		switch (c) {
		case '+':
			System.out.println("Total is : " + (n1+n2));
			break;
		case 'x':
			System.out.println("Product is : " + (n1*n2));
			break;
		case '-':
			System.out.println("Different of the numbers is : " + (n1-n2));
			break;
		case '/':
			System.out.println("Divide solution is : " + (n1/n2));
			break;
			default:
				System.out.println("Enter valid calculation");
		}

	}
	
	public static void main(String[] args) {
		/*TASK:
			 * Create a method outside of the main method
			 * Ask user to enter two numbers
			 * Ask user which operation he wants to do
			 * Print the result after doing the operation which user asked
			 * Call the method from inside the main method*/

		calculator();
		
	}
}
