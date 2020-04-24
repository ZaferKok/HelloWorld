package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion2 {

	public static void main(String[] args) {

		// Type java code by using if-else statement,
		// Write a program to print absolute value of a number entered by user.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		
		int num = scan.nextInt();
				if(num>=0) {
					System.out.println("The absolute value of " + num + " is " + num);
				}else {
					System.out.println("The absolute value of " + num + " is " + ((-1)*num));
				}
		
		
		
		
		
		
		
		
		
		
		
	}

}
