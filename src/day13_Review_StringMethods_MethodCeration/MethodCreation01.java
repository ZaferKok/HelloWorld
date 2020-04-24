package day13_Review_StringMethods_MethodCeration;

import java.util.Scanner;

public class MethodCreation01 {
	public static void addTwoNums() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("The sum of two numbers is : " + (num1 + num2));
	}
	public static void main(String[] args) {
		/*Create a method outside of the main method like;
		 * Ask user to enter two numbers then print their sum on the console
		 * Call the method from inside the main method.
		 */
		addTwoNums(); // Calling Method
	}

}
