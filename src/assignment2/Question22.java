package assignment2;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		/*Ask user to enter a number, 
		 * if the number is even 
		 * print on the console
		* “That number is even.” 
		* If the number is odd, 
		* print on the console
		* “That number is odd.”
		*/
		Scanner digit = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = digit.nextInt();
		
		int even = num%2;
		
		if (even==0) {
			System.out.println("That number is even");
		}
		if (even!=0) {
			System.out.println("That number is odd");
		}
	}

}
