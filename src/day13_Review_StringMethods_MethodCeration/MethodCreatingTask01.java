package day13_Review_StringMethods_MethodCeration;

import java.util.Scanner;

public class MethodCreatingTask01 {
	
	public static void multiplyTwoNums() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		/*Create a method outside of the main method like;
		 * Ask user to enter two numbers then print their product (multiply) on the console
		 * Call the method from inside the main method.*/
		 
		multiplyTwoNums();
		
	}

}
