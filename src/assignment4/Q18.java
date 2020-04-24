package assignment4;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		/*Ask user to enter one of the 
		 * first three letters of the alphabet. 
		 * Output will be the order number of the 
		 * letter in the alphabet. For example
			If user enters ‘a’ output will be 1. 
			Your code should run for both uppercases 
			and lowercases. 
			Solve by using switch.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an letter of first three in alphabet");
		String letter = scan.next();
		
		String r = letter.toUpperCase();
		
		switch (r) {
		case "A":
			System.out.println("1");
			break;
		case "B":
			System.out.println("2");
			break;
		case "C":
			System.out.println("3");
			break;
		default:
			System.out.println("Enter only first three letters of alphabet");
			
		
		}
		
	}

}
