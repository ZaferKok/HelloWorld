package assignment2;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		/*Ask user to enter a number, 
		 * if the number is greater than 300
		 * print on the console
		“That number is greater than 300.” 
		If the number is not greater than 300, print
		on the console 
		“That number is not greater than 300.”*/

		Scanner digit = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = digit.nextInt();
		
		if (num>300) {
			System.out.println("That number is greater than 300");
		}else {
			System.out.println("hat number is not greater than 300");
		}
	}
}
