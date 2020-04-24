package assignment2;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		/*Ask user to enter a number, 
		 * if the number is divisible 
		 * by 5 print on the console
		 * “That number can be divided by 5.
		 * ” If the number is not divisible by 5,
		 * print on the console 
		 * “That number cannot be divided by 5.”
		 */
		Scanner digit = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = digit.nextInt();
		
		if (num%5==0) {
			System.out.println("That number is divisible by 5");
		}else {
			System.out.println("That number cannot be divisible by 5");
		}
		
	}

}
